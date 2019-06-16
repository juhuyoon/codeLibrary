import LinkedList from '../linked-list/LinkedList'

// Setting the hash table size
const defaultHashTableSize = 32

export default class HashTable {
  constructor(hashTableSize = defaultHashTableSize) {
    this.buckets = Array(hashTableSize).fill(null).map(() => new LinkedList())

    this.keys = {}
  }

  hash(key) {
    const hash = Array.from(key).reduce(
      (hashAccumulator, keySymbol) => (hashAccumulator + keySymbol.charCodeAt(0)),
      0,
    )
    return hash % this.buckets.length
  }

  set(key, value) {
    const keyHash = this.hash(key)
    this.keys[key] = keyHash
    const bucketLinkedList = this.buckets[keyHash]
    const node = bucketLinkedList.find({ callback: nodeValue => nodeValue.key === key })

    if (!node) {
      bucketLinkedList.append({ key, value })
    } else {
      node.value.value = value
    }
  }

  delete(key) {
    const keyHash = this.hash(key)
    delete this.keys[key]
    const bucketLinkedList = this.buckets[keyHash]
    const node = bucketLinkedList.find({ callback: nodeValue => nodeValue.key === key })
 
    if (node) {
      return bucketLinkedList.delete(node.value)
    }
    return null
  }

  get(key) {
    const bucketLinkedList = this.buckets[this.hash(key)]
    const node = bucketLinkedList.find({ callback: nodeValue => nodeValue.key === key })

    return node ? node.value.value : undefined
  }

  has(key) {
    return Object.hasOwnProperty.call(this.keys, key)
  }

  getKeys() {
    return Object.keys(this.keys)
  }
}
