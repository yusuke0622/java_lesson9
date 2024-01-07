public class Human {
    
    private static int count = 0;
    private String name;
    private int birthday;
    private int manpukudo = 50;
    
    public Human(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName() {
        return this.name;
    }
    // setManpukudo()でフィールドに値をセットするだけでは、有無を言わず満腹度200にしたり、０にしたり無茶な行為になり、カプセル化してる意味があまりない。
    //戻り値をbooleanにすることで、メソッド通り実行されたか分かるようにする
    public boolean eat() {
        //初期値
        boolean result = false;
        //満腹度が100を超えてる場合はeatメソッドは実行されないようにする
        if(this.manpukudo < 100){
            this.manpukudo += 4; 
            if (this.manpukudo > 100){
                this.manpukudo = 100;
            }
            //メソッドが実行されたらtrueで返すようにする
            result = true;
        }
        return result;
    }
    
    public boolean walk() {
        boolean result = false;
        if(this.manpukudo > 0) {
            this.manpukudo -= 10;
            if(this.manpukudo < 0) {
                this.manpukudo = 0;
            }
            result = true;
        }
        return result;
    }
    
    public boolean run() {
        boolean result = false;
        if(this.manpukudo > 0){
            this.manpukudo -= 20;
            if(this.manpukudo < 0) {
                this.manpukudo = 0;
            }
            result = true;
        }
        return result;
    }
    
}