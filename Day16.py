class ListNode:
    def __init__(self, value):
        self.value = value
        self.next = None

def hasCycle(head):
    if not head or not head.next:
        return False
    
    # Initialize two pointers, slow and fast
    slow = head
    fast = head.next

    while fast and fast.next:
        if slow == fast:
            # Cycle detected
            return True

        # Move slow pointer one step and fast pointer two steps
        slow = slow.next
        fast = fast.next.next

    # No cycle found
    return False

# Example usage:
# Create a linked list with a cycle
head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = head.next  # Creating a cycle

result = hasCycle(head)
print(result)  # Output: True
