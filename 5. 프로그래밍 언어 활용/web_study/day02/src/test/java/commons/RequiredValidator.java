package commons;

public interface RequiredValidator {
    default void requiredCheck(String str, RuntimeException e){
        if(str == null || str.isBlank()){
            throw e;
        }
    }
}
