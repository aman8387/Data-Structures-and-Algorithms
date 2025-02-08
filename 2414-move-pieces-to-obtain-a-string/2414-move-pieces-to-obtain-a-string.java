class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();

        String startFiltered = start.replace("_", "");
        String targetFiltered = target.replace("_", "");
        if (!startFiltered.equals(targetFiltered)) {
            return false;
        }

        int sid= 0;
        int tid = 0;

        while (sid < n && tid< n){
            while(sid<n && start.charAt(sid)=='_'){
                sid++;
            }
            while(tid<n && target.charAt(tid)=='_'){
                tid++;
            }
            if(sid == n && tid == n){
                return true;
            }
            if(sid == n|| tid == n){
                return false;
            }
            if(start.charAt(sid) != target.charAt(tid) || 
            start.charAt(sid) == 'L' && sid<tid || 
            start.charAt(sid) == 'R' && tid<sid){
                return false;
            }
            sid++;
            tid++;
        }
        return true;
    }
}