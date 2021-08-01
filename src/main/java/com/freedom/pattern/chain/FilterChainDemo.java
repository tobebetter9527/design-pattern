package com.freedom.pattern.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟web请求request和response的处理
 * <p>
 * 有若干个Filter，request先经过第一个Filter处理，然后是第二个，直到最后一个；然后response返回则返过来，先经过最后一个Filter,
 * 然后倒数第二个，以此类推。
 * </P>
 *
 * @author tobebetter9527
 * @create 2021/07/25 14:40
 */
public class FilterChainDemo {


  public static void main(String[] args) {
    Request request = new Request();
    Response response = new Response();
    request.req = "你好，<script>, 我们都是996";
    response.res = "返回顺序：";

    FilterChain chain = new FilterChain();
    chain.add(new WordFilter()).add(new HtmlFilter());
    chain.doFilter(request, response);
    System.out.println("===============");
    System.out.println(request.req);
    System.out.println(response.res);
  }
}

interface Filter {

  void doFilter(Request request, Response response, FilterChain chain);
}

class HtmlFilter implements Filter {

  @Override
  public void doFilter(Request request, Response response, FilterChain chain) {
    request.req = request.req.replaceAll("<", "[").replaceAll(">", "]");
    System.out.println("HtmlFilter:" + request.req);
    chain.doFilter(request, response);
    response.res = response.res + "--HtmlFilter";
  }
}

class WordFilter implements Filter {

  @Override
  public void doFilter(Request request, Response response, FilterChain chain) {
    request.req = request.req.replaceAll("996", "955");
    System.out.println("WordFilter:" + request.req);
    chain.doFilter(request, response);
    response.res = response.res + "--WordFilter";
  }
}

class FilterChain {

  private List<Filter> filters = new ArrayList<>();
  private int index;

  public FilterChain add(Filter filter) {
    filters.add(filter);
    return this;
  }

  public void doFilter(Request request, Response response) {
    if (index == filters.size()) {
      return;
    }
    Filter filter = filters.get(index);
    index++;
    filter.doFilter(request, response, this);
  }
}


class Request {

  String req;
}

class Response {

  String res;
}


