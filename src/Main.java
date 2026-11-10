void main() {
   Node<Integer> intNode = new Node<>(2);
   intNode.addAdj(new Node<>(4), 2);
   intNode.addAdj(new Node<>(5), 2);
   intNode.addAdj(new Node<>(6), 2);
   intNode.addAdj(new Node<>(7), 2);
   intNode.addAdj(new Node<>(8), 2);
   intNode.addAdj(new Node<>(9), 2);
   intNode.addAdj(new Node<>(67), 2);
    IO.println(intNode.toString());
}
