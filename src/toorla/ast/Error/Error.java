package toorla.ast.Error;

import toorla.ast.Program;
import java.util.*;


class Error {

  String message;
  int line;

  public Error(String message,int line){
    this.message = message;
    this.line = line;
  }

  public int getLine(){
    return this.line;
  }

  public String getMessage(){
    return this.message;
  }

}
