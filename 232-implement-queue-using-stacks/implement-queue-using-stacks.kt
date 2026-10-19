class MyQueue() {
    private val inputStack = Stack<Int>()
    private val outputStack = Stack<Int>()

    // Push element x to the back of queue.
    fun push(x: Int) {
        inputStack.push(x)
    }

    // Removes the element from the front of the queue and returns it.
    fun pop(): Int {
        peek() // Ensure outputStack is populated
        return outputStack.pop()
    }

    // Get the front element.
    fun peek(): Int {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop())
            }
        }
        
        return outputStack.peek()
    }

    // Returns whether the queue is empty.
    fun empty(): Boolean {
        return inputStack.isEmpty() && outputStack.isEmpty()
    }
}