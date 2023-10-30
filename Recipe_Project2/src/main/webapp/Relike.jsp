<%@page import="com.smhrd.controller.RecipeSelect"%>
<%@page import="com.smhrd.model.RecipeVO"%>
<%@page import="com.smhrd.model.RecipeDAO"%>
<%@page import="com.smhrd.model.MemberVO"%>
<%@page import="com.smhrd.model.MemberDAO"%>
<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@page import="com.smhrd.model.RelikeVO"%>
<%@page import="java.util.List"%>
<%@page import="com.smhrd.model.RelikeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="./img/android-chrome-512x512.png">
    <title>좋아요</title>
    <link rel="stylesheet" href="./css/relike.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />

</head>
<body>

<%
      //session값 가져오기
      MemberVO loginVO = (MemberVO) session.getAttribute("loginVO");
      String mem_id = loginVO.getMem_id();
      
      RelikeDAO dao = new RelikeDAO();
      List<RecipeVO> RelikeSelectList = dao.RelikeSelect(mem_id);
      System.out.println("좋아요리스트 :" +RelikeSelectList.size());
      
      %>


    <div class="wrap">

        <!-- header -->
        <header>
            <div class="header">
                <div class="h_cont1">
                    <div class="h_icon">
                        <a href="test_of_main.html"><img class="logo" src="/Project_copy/img/tomato.png" alt="Logo"
                                width="55px"></a>
                    </div>
                </div>
        
                <div class="h_cont2">
                    <li>
                    <input type="text" placeholder="search" class="h_cont2_input" name="food_name">
                    <input type="submit" value="검색"; class="h_cont2_btn">

                    </li>
                    <li><a href="mypage_test.html">마이페이지</a></li>
                    <li><a href="test_of_login.html">로그인</a></li>
                    <li><a href="test_of_main.html">로그아웃</a></li>
                </div>
            </div>
        </header>
    
        <!-- sidebar -->
        <div id="sidebar">
            <div class="navigation">
                <!-- <input type="checkbox" id="expand-menu" name="expand-menu"> -->
                <ul>
                    <li>
                        <a href="mypage_test.html">
                            <span class="icon">
                                <span class="material-symbols-outlined">
                                    home
                                </span>
                            </span>
                            <span class="title">홈</span>
                        </a>
                    </li>
                    <li>
                        <a href="test_of_update.html">
                            <span class="icon">
                                <span class="material-symbols-outlined">
                                    account_circle
                                </span>
                            </span>
                            <span class="title">회원정보</span>
                        </a>
                    </li>
                    <li>
                        <a href="test_of_like.html">
                            <span class="icon">
                                <span class="material-symbols-outlined">
                                    favorite
                                </span>
                            </span>
                            <span class="title">북마크</span>
                        </a>
                    </li>
                    <li>
                        <a href="test_of_comment.html">
                            <span class="icon">
                                <span class="material-symbols-outlined">
                                    chat_bubble
                                </span>
                            </span>
                            <span class="title">내 댓글</span>
                        </a>
                    </li>
                    <li>
                        <a href="mailto:smart1234@gmail.com?body=문의사항을 작성해주세요.">
                            <span class="icon">
                                <span class="material-symbols-outlined">
                                    mail
                                </span>
                            </span>
                            <span class="title">문의사항</span>
                        </a>
                    </li>
                </ul>        
            </div>
        </div>

        <section id="section">
            <div class="title">
                <h3>좋아요</h3>
            </div>
            <div class="content">
                <form>

                    <ul class="gallery">
                        <li>
                            <div>

                                <a href="detial.html">
                                    <span class="thumb"
                                    
                                    <% for(int i = 0 ; i <RelikeSelectList.size() ; i++){ %>>
                         
                                        <img class="gallery_img" src=<%=RelikeSelectList.get(i).getRe_url() %> alt="썸네일1">
                                    </span>
                                    <div class="list_info">
                                        <div class="tit"><%=RelikeSelectList.get(i).getFood_name() %>
                                        ⭐<%=RelikeSelectList.get(i).getRe_level()%>
                                       🕒<%=RelikeSelectList.get(i).getRe_time()%>
                                       👩<%=RelikeSelectList.get(i).getRe_per() %>
                                       
                                            
                  <form action="RelikeDelete.do" method="post" >
                        <input type="hidden"  name="mem_id" value="<%=loginVO.getMem_id()%>">
                        <input type="hidden"  name="re_code" value="<%=RelikeSelectList.get(i).getRe_code() %>" >
                         <input type="submit" value="삭제">
                </form>                                         
                                      
                                        </div>
                                    
                                    </div>
                                </a>
                            </div>
                        </li>
                                        <%} %>

                        
                    </ul>
                </form>
            </div>
        </section>

    </div>
</body>
</html>