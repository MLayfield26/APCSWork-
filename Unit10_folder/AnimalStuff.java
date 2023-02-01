public  class AnimalStuff{
public static float average LegCount(ArrayList<Animal> animals){
  float sum = 0;
  for (int i = 0; i<animals.size()i++){
Animal a += animals.get(i);
    total+= a.getWiskers();
  }
}
  public static void main(String[] args){
    ArrayList<Animal> animals = new ArrayList<Animal>();

    animals.add(new Animal("horse","dog","184"));
    animals.add(new Animal("eee","doggie","1"));

      for(Animal a : animals)
      System.out.println(a.getName() + " is a " a.getType());
  }
}
