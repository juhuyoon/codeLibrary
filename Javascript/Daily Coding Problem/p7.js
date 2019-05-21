/* 
This problem was asked by Google.

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
Given the root to a binary tree, count the number of unival subtrees. 
For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
*/

//Node tree traversal. 

class Node {
  constructor(val, left=null, right=null) {
     this.val = val;
     this.left = left;
     this.right = right;
  }
}
//example taken
const tree =                        new Node(0,

   new Node(1),              new  Node(0,

                     new Node(1,                 // 0

                 1,              1) ,            new Node(0)));

const countUnival = (root) => {
   let numUnival = 0;

   const processNode = (node, value) => {
      if(node.right || node.left) {
         if(node.right) {
            if(node.right.val === value) {
               if(processNode(node.right, value)) {
                  numUnival++;
               } 
            } else {
               return processNode(node.right, value);
            }
         }

         if(node.left) {
            if(node.left.val === value) {
               if(processNode(node.left, value)) {
                  numUnival++;
               }
            } else {
               return processNode(node.left, value);
            }
         }
      } else {
         numUnival++;
         return true;
      }
   }

   processNode(root, root.val);
   return numUnival;
}

console.log(countUnival(tree));