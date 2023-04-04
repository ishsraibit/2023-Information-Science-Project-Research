package main;
enum Character{
    Barbarian,
    Druid,
    Necromancer,
    Rogue,
    Sorceress
}
public class GameDemo {
    public static void main(String[] args) {
        Character player = Character.Barbarian;

        if(player == Character.Barbarian){
            System.out.println("휠윈드 시전");
        } else if (player == Character.Sorceress) {
            System.out.println("파이어볼 발사");
        } else if (player == Character.Druid) {
            System.out.println("늑대인간 변신");
        } else if (player == Character.Rogue) {
            System.out.println("전류의 일격");
        } else if (player == Character.Necromancer) {
            System.out.println("스켈레톤 소환");
        } else{
            System.out.println("플레이가 가능한 캐릭터가 아닙니다");
        }
    }
}
