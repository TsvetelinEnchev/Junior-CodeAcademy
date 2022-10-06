package Exercises_From_Mentors.exercise_HotelReservations;

public class Room extends Inventory {
    //num of bads ...
    //Inventory ....
    // Items  -> Map - String (the item), int number of the item
    private int spot;

    public Room() {
    }

    public int getSpot() {
        return spot;
    }

    public void setSpot(int spot) {
        if (spot==3) {
            this.spot = spot;
            setTv(true);
            setCoffee(true);
            setCouch(true);
            setMinibar(true);
        }else if (spot==2){
            this.spot = spot;
            setTv(true);
            setCoffee(false);
            setCouch(false);
            setMinibar(true);
        }else if (spot==1){
            this.spot = spot;
            setTv(true);
            setCoffee(false);
            setCouch(false);
            setMinibar(true);
        }
    }

    @Override
    public String toString() {
        return
                "spot=" + spot +"\n"+"inventory:"+"\n"+"Minibar:"+isMinibar()+"\n"+"Coffee:"+isCoffee()
                +"\n"+"Couch:"+isCouch()+"\n"+"TV:"+isTv();
    }
}
