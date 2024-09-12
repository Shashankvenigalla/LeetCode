class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        
        allowed_cnt = Counter(allowed)

        res=0

        for word in words:
            is_valid=True
            word_cnt=Counter(word)
            for key in word_cnt:
                if key not in allowed_cnt:
                    is_valid=False
            if is_valid:
                res+=1

                
        return res