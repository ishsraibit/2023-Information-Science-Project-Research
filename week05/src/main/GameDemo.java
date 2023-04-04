package main;

public class GameDemo {
    public static void main(String[] args) {
        DiabloCharacter player1 = DiabloCharacter.NECROMANCER;
        //PokemonCharacter player1 = PokemonCharacter.PIKACHU;
        PokemonCharacter player2 = PokemonCharacter.PIKACHU;

        if(player1 == DiabloCharacter.BARBARIAN){
            System.out.println("휠윈드 시전");
        } else if (player1 == DiabloCharacter.SORCERESS) {
            System.out.println("파이어볼 발사");
        } else if (player1 == DiabloCharacter.DRUID) {
            System.out.println("늑대인간 변신");
        } else if (player1 == DiabloCharacter.ROGUE) {
            System.out.println("전류의 일격");
        } else if (player1 == DiabloCharacter.NECROMANCER) {
            System.out.println("스켈레톤 소환");
        } else{
            System.out.println("플레이가 가능한 캐릭터가 아닙니다");
        }
    }
}
