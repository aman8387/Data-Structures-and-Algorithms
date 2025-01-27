class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        unordered_map<int, int> freq;
        unordered_map<int, int> first;
        unordered_map<int, int> last;

        for (int i = 0; i < nums.size(); i++) {
            if (first.find(nums[i]) == first.end()) {
                first[nums[i]] = i;
            }
            last[nums[i]] = i;
            freq[nums[i]]++;
        }

        int degree = 0;
        for (auto& pair : freq) {
            degree = std::max(degree, pair.second);
        }

        int minLength = nums.size();
        for (auto& pair : freq) {
            if (pair.second == degree) {
                int length = last[pair.first] - first[pair.first] + 1;
                minLength = std::min(minLength, length);
            }
        }

        return minLength;
    }
};
