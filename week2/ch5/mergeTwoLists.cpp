/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode *index1 = l1;
        ListNode *index2 = l2;
        ListNode *node = new ListNode(0);
        ListNode *cur = node;
        while(index1 != NULL && index2 != NULL){
            if(index1 -> val <= index2 -> val){
                cur -> next = index1;
                index1 = index1 -> next;
            }else{
                cur -> next = index2;
                index2 = index2 -> next;
            }
            cur = cur -> next;
        }
        cur -> next = index1 == NULL ? index2 : index1;
        return node -> next;
    }
};
