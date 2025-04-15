package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {

    public void printAllList(ArrayList<BoardDTO> list) {
        // list에 출력할 내용이 없으면 “게시물이 없습니다” 출력
        if (list != null && !list.isEmpty()) {
            System.out.println("===== 게시글 목록 ====");
            for (BoardDTO dto : list) {
                System.out.println("번호 : " + dto.getBoardNo());
                System.out.println("제목 : " + dto.getBoardTitle());
                System.out.println("작성일 : " + dto.getBoardDate());
                System.out.println("-------------------------------");
            }
        } else {
            System.out.println("게시물이 없습니다.");
        }
    }

    public void printBoard(ArrayList<BoardDTO> list) {
        // 전달받은 내용 출력
        if (list != null && !list.isEmpty()) {
            System.out.println("==== 게시글 상세 ====");
            for (BoardDTO dto : list) {
                System.out.println(dto.toString());
            }
            System.out.println(list.toString());
        } else {
            System.out.println("존재하지 않는 게시글입니다.");
        }
    }

    public void errorPage(String msg) {
        //        전달받은 문자열에 따라서 실패내용 출력
        //        insertBoard : 게시물 등록 실패
        //        selectOne : “조회된 글이 없습니다.”
        //        updateTitle : ”게시물 제목 수정 실패 !”
        //        updateContent : ”게시글 내용 수정 실패 !”
        //        deleteBoard : ”게시글 삭제 실패 !”
        System.out.println("==== 오류 ====");
        System.out.println(msg);

        switch (msg) {
            case "insertBoard":
                System.out.println("게시물 등록 실패!");
                break;
                case "selectOne":
                    System.out.println("조회된 글이 없습니다.");
                    break;
                    case "updateTitle":
                        System.out.println("게시글 내용 수정 실패!");
                        break;
                        case "updateContent":
                            System.out.println("게시글 내용 수정 실패 !");
                            break;
                            case "deleteBoard":
                                System.out.println("게시글 삭제 실패!");
                                break;
                                default:
                                    System.out.println("알 수 없는 오류가 발생했습니다.");
        }
    }

    public void successPage(String msg){
        //        전달받은 문자열에 따라서 실패내용 출력
        //        insertBoard : “게시글 등록 성공!” 출력
        //        updateTitle: “게시글 제목 수정 성공!” 출력
        //        updateContent:”게시글 내용 수정 성공!” 출력
        //        deleteBoard:”게시글 삭제 성공!” 출력
        System.out.println("==== 성공 ====");

        switch (msg) {
            case "insertBoard":
                System.out.println("게시글 등록 성공!");
                break;
                case "updateTitle":
                    System.out.println("게시글 제목 수정 성공!");
                    break;
                    case "updateContent":
                        System.out.println("게시글 내용 수정 성공!");
                        break;
                        case "deleteBoard":
                            System.out.println("게시글 삭제 성공!");
                            break;
                            default:
                                System.out.println("작업이 성공적으로 완료되었습니다.");
        }
    }

    public void noSearchResult() {
        System.out.println("검색 결과가 없습니다.");
    }

}
