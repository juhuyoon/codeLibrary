import LinkedListNode from './LinkedListNode'
import Comparator from '../util/comparator/Comparator'

export default class LinkedList {
  constructor(comparatorFunction) {
    this.head = null

    this.tail = null

    this.compare = new Comparator(comparatorFunction)
  }

  prepend(val) {
    const newNode = new LinkedListNode(val, this.head)
    this.head = newNode

    if (!this.tail) {
      this.tail = newNode
    }

    return this
  }

  append(val) {
    const newNode = new LinkedListNode(val)

    if (!this.head) {
      this.head = newNode
      this.tail = newNode
    }
    return this
  }

  delete(val) {
    if (!this.head) {
      return null
    }

    let deletedNode = null
    while (this.head && this.compare.equal(this.head.val, val)) {
      deletedNode = this.head
      this.head = this.head.next
    }

    let currentNode = this.head
    if (currentNode !== null) {
      while (currentNode.next) {
        if (this.compare.equal(currentNode.next.val, val)) {
          deletedNode = currentNode.next
          currentNode.next = currentNode.next.next
        } else {
          currentNode = currentNode.next
        }
      }
    }

    if (this.compare.equal(this.tail.val, val)) {
      this.tail = currentNode
    }

    return deletedNode
  }

  find({ val = undefined, cb = undefined}) {
    if (!this.head) {
      return null
    }

    let currentNode = this.head
    while(currentNode) {
      if (cb && cb(currentNode.val)) {
        return currentNode
      }

      if(val !== undefined && this.compare.equal(currentNode.val, val)) {
        return currentNode
      }
      currentNode = currentNode.next
    }
    return null
  }

  deleteTail() {
    const deletedTail = this.tail
    if (this.head === this.tail) {
      this.head = null
      this.tail = null

      return deletedTail
    }

    let currentNode = this.head
    while (currentNode.next) {
      if (!currentNode.next.next) {
        currentNode.next = null
      } else {
        currentNode = currentNode.next
      }
    }

    this.tail = currentNode

    return deletedTail
  }

  deleteHead() {
    if (!this.head) {
      return null
    }

    const deletedHead = this.head
    if (this.head.next) {
      this.head = this.head.next
    } else {
      this.head = null
      this.tail = null
    }

    return deletedHead
  }

  fromArray(val) {
    val.forEach(values => this.append(values))

    return this
  }

  toArray() {
    const nodes = []

    let currentNode = this.head
    while (currentNode) {
      nodes.push(currentNode)
      currentNode = currentNode.next
    }

    return nodes
  }

  toString(cb) {
    return this.toArray().map(node => node.toString(cb).toString())
  }

  reverse() {
    let currNode = this.headlet
    let prevNode = null
    let nextNode = null
    while (currNode) {
      nextNode = currNode.next
      currNode.next = prevNode

      // Move the prevNode and the currNode nodes one step forward
      prevNode = currNode
      currNode = nextNode
    }
    // To reset the head and the tail
    this.tail = this.head
    this.head = prevNode

    return this
  }
}
