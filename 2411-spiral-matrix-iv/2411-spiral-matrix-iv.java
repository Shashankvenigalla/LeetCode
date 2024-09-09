/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][] visited=new int[m][];
        for(int i=0;i<m;i++){
            visited[i]=new int[n];
            Arrays.fill(visited[i],-1);
        }
        int min_row=0,min_col=0;
        int max_row=m-1,max_col=n-1;
        while(min_row<=max_row && min_col<=max_col){
            int i=min_row;
            while(i<=max_col){
                if(head!=null){
                visited[min_row][i]=head.val;
                head=head.next;
                }
                else{break;}
                i++;
            }
            min_row++;
            i=min_row;
            while(i<=max_row){
                if(head!=null){
                visited[i][max_col]=head.val;
                head=head.next;
                }
                else{break;}
                i++;
            }
            max_col--;
            i=max_col;
            while(i>=min_col){
                if(head!=null){
                visited[max_row][i]=head.val;
                head=head.next;
                }
                else{break;}
                i--;
            }
            max_row--;
            i=max_row;
            while(i>=min_row){
                if(head!=null){
                visited[i][min_col]=head.val;
                head=head.next;
                }
                else{break;}
                i--;
            }
            min_col++;
        }
        return visited;
    }
}