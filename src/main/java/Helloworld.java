public class Helloworld {

  private String field;
    private String fields;

  public void use() {
    new DeprecatedExample().deprecatedMethod();
    System.exit(33); // violation on findbugs rule: DM_EXIT
  }

  public void useFieldForLcom4() {
    System.out.println(field);
  }
}
