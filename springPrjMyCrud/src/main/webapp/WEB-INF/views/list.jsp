<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <style>
            #wrap {
                width: 70vw;
                height: 80vh;
                display: flex;
                align-items: center;
                justify-content: center;
            }

            #wrap01 {
                width: 50%;
                height: 100%;
                border: 1px solid black;
                margin-left: 30px;
            }

            #wrap02 {
                width: 50%;
                height: 100%;
                border: 1px solid black;
                margin-left: 30px;
            }

            #topArea {
                display: flex;
                justify-content: space-around;
            }

            .table01 {
                width: 100%;
            }

            .userName:hover {
                background-color: gray;
                cursor: pointer;
            }

            #btnArea {
                margin-left: 10px;
            }

            .modal-body {
                height: 40px;
                width: 400px;
                margin-top: 30px;
            }

            .modal-body input {
                margin-top: 30px;
                margin-left: 30px;
                width: 250px;
                height: 50px;

            }
        </style>
    </head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>

    <body>

        <h1>학원생 관리 웹 프로그램</h1>

        <div id="wrap">

            <div id="wrap01">

                <div id="topArea">
                    <button>전체보기</button>
                    <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">글
                        등록</button>

                    <!-- 검색 영역 -->
                    <form action="" class="searchArea">

                        <select name="searchValue" id="">
                            <option value="">번호</option>
                            <option value="">이름</option>

                        </select>
                        <input type="text" name="searchValue">
                        <input type="submit" value="검색">
                    </form>
                </div>

                <hr>

                <div id="tableArea">
                    <table border="3px" style="text-align: center;" class="table01">
                        <thead>
                            <tr>
                                <td>NO</td>
                                <td>이름</td>
                                <td>거주주소(동)</td>
                                <td>대학교</td>
                                <td>전공</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>01</td>
                                <td class="userName" onclick="goInfo();">김도연</td>
                                <td>광명</td>
                                <td>오산대</td>
                                <td>전자과</td>
                            </tr>
                        </tbody>
                    </table>
                </div>

            </div>

            <div id="wrap02">

                <h3>번호 :</h3>
                <hr>
                <h3>이름 :</h3>
                <hr>
                <h3>거주 주소 :</h3>
                <hr>
                <h3>대학교 : </h3>
                <hr>
                <h3>전공 :</h3>

                <div id="btnArea">
                    <button style="width:100px; height: 30px;">수정</button>

                    <button style="width:100px; height: 30px;">삭제</button>
                </div>

            </div>

            <div class="modal-dialog modal-lg">...</div>

        </div>

        <!-- 모달 창 코드 -->
        <div class="modal fade" id="staticBackdrop" data-bs-keyboard="false" tabindex="-1"
            aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content" style="height: 600px; width: 550px;">
                    <h2>학원생 등록</h2>
                    <div class="modal-body">
                        <div>
                            &nbsp;&nbsp; 이름 : <input type="text" name="" id="" placeholder="이름">
                        </div>
                        <div>
                            거주지 : <input type="text" name="" id="" placeholder="거주지">
                        </div>
                        <div>
                            대학교 : <input type="text" name="" id="" placeholder="대학교">
                        </div>
                        <div>
                            &nbsp;&nbsp; 전공 : <input type="text" name="" id="" placeholder="전공">
                        </div>
                    </div>
                    <div class="modal-footer" style="margin: auto;">
                        <button class="btn btn-primary">등록</button>
                        <button class="btn btn-primary" data-bs-target="#exampleModalToggle"
                            data-bs-toggle="modal">닫기</button>
                    </div>
                </div>
            </div>
        </div>

        </div>

    </body>

    </html>
    <script>
        function goInfo(target) {
            console.log(target);
        }

    </script>