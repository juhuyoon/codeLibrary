import HashTable from '../hash-table/HashTable';
/* A tree is a general structure of recursive nodes.
There are many types of trees.
Popular ones are binary tree and balanced tree.
A Trie is a kind of tree, known by many names including prefix tree,
digital search tree, and retrieval tree (hence the name 'trie').
*/

export default class TrieNode {
  constructor(char, isCompleteWord = false) {
    this.char = char
    this.isCompleteWord = isCompleteWord
    this.children = new HashTable() // imagine the data nodes set to hashtable
  }

  getChild(char) {
    return this.children.get(char)
  }

  addChild(char, isCompleteWord = false) {
    if (!this.children.has(char)) {
      this.children.set(char, new TrieNode(char, isCompleteWord))
    }

    const childNode = this.children.get(char)

    childNode.isCompletedWord = childNode.isCompleteWord || isCompleteWord
    // when it's set to childNode, it's true, else it's false

    return childNode
  }

  removeChild(char) {
    const childNode = this.getChild(char)
    if (childNode
      && !childNode.isCompleteWord
      && !childNode.hasChildren()
    ) {
      this.children.delete(char)
    }
    return this
  }

  hasChild(char) {
    return this.children.has(char)
  }

  hasChildren() {
    return this.children.getKeys().length !== 0
  }

  suggestChildren() {
    return [...this.children.getKeys()]
  }

  toString() {
    let childrenAsString = this.suggestChildren.toString()
    childrenAsString = childrenAsString ? `:${childrenAsString}` : ''
    const isCompleteString = this.isCompleteWord ? '*' : ''

    return `${this.character}${isCompleteString}${childrenAsString}`
  }
}
