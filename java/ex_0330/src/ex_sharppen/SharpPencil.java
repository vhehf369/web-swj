package ex_sharppen;
/*
public class SharpPencil {//샤프펜
    private int width; //펜의 굵기
    private int amount; //남은 량
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
}

class Ballpen{ //볼펜
    private int amount; //남은 량
    private String color; //볼펜의 색
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}

class FountainPen{
    private int amount; //만년필
    private String color; //볼펜의 색
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public void refill(int n){setAmount(n);}
*/
    /*
  필기구 클래스를 상속으로 설계하시오
- 여러 종류의 필기구를 관리하는 프로그램
- 필기구에는 공통적으로 남은양(amount)가 있고, 종류에 따라 추가 속성이 있을 수 있다.

Pen 클래스
- 모든 펜의 부모 클래스이다.
- 남은양을 저장하는 amount 필드를 가진다.

SharpPen클래스
- Pen을 상속받는다.
- 샤프심의 굵기를 나타내는 width 필드를 가진다.

BallPen클래스
- Pen클래스를 상속받는다.
- 볼펜의 색을 나타내는 color필드를 가진다.

FountainPen클래스
- BallPen클래스를 상속받는다.
- 만년필은 잉크를 다시 채울 수 있으므로 refill(int n)메서드를 작성한다.
- refill 메서드는 남은 양을 n으로 변경한다.
     */
//}
