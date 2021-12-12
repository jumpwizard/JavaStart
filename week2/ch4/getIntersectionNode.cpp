class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *indexA = headA;
        ListNode *indexB = headB;
        int numA = 0;
        int numB = 0;
        while(indexA != NULL){
            indexA = indexA -> next;
            numA++;
        }
        while(indexB != NULL){
            indexB = indexB -> next;
            numB++;
        }
        indexA = headA;
        indexB = headB;
        //链表体量差
        int n;
        if (numA >= numB){
            n = numA - numB;
            for(int i = 0; i < n; i++){
                indexA = indexA -> next;
            }
        }else{
            n = numB - numA;
            for(int i = 0; i < n; i++){
                indexB = indexB -> next;
            }
        }
        while(indexA != NULL){
            if(indexA != indexB){
                indexA = indexA -> next;
                indexB = indexB -> next;
            }else{
                return indexB;
            }
        }
        return NULL;

    }
};
