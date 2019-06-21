import TrieNode from './TrieNode'

// Char that we will use for trie tree root
const HEAD_CHAR = '*'

export default class Trie {
  constructor() {
    this.head = new TrieNode(HEAD_CHAR)
  }

  addWord(word) {
    const characters = Array.from(word)
    let currentNode = this.head

    for (let i = 0; i < characters.length; i += 1) {
      const isComplete = i === (characters.length - 1)
      currentNode = currentNode.addChild(characters[i], isComplete)
    }
    return this
  }

  deleteWord(word) {
    const depthFirstDelete = (currentNode, i = 0) => {
      if (i >= word.length) {
        // returns if deleting the caracter that is out of the word's scope
        return
      }
      const character = word[i]
      const nextNode = currentNode.getChild(character)

      if (nextNode === null) {
        return
      }
      // recursion to dive deeper to next child
      depthFirstDelete(nextNode, i + 1)

      // This is done to stop tracing the node as we will be deleting it.
      if (i === (word.length - 1)) {
        nextNode.isCompleteWord = false
      }

      // will only remove if that childNode has no children
      // && childNode.isCompleteWord = false
      currentNode.removeChild(character)
    }

    depthFirstDelete(this.head)

    return this
  }

  suggestNextCharacters(word) {
    const lastChar = this.getLastCharacterNode(word)

    if (!lastChar) {
      return null
    }

    return lastChar.suggestChildren()
  }

  doesWordExist(word) {
    const lastChar = this.getLastCharacterNode(word)
    // !! === if it was falsey, it will be false, otherwise true
    return !!lastChar && lastChar.isCompleteWord
  }

  getLastCharacterNode(word) {
    const char = Array.from(word)
    let currentNode = this.head

    for (let i = 0; i < char.length; i += 1) {
      if (!currentNode.hasChild(char[i])) {
        return null
      }

      currentNode = currentNode.getChild(char[i])
    }

    return currentNode
  }
}
