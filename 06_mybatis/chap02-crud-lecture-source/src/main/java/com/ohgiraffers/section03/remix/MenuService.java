package com.ohgiraffers.section03.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.section03.remix.Template.getSqlSession;

/* 설명.
 *  Service 계층 이후부터는 xml방식, javaconfig방식, remix 방식 중 어떤 것을 선택할 지 고민해서 진행해야 한다.
 *  remix 방식의 경우는,
 *  mybatis 설정은 javaconfig 방식을 취하고, 쿼리를 다루는 것은 xml 방식을 취한다.
 *  DAO에 해당하는 것은 추상메소드를 지닌 인터페이스로 만드는데 이 인터페이스와 mapper용 xml은 세가지를 준수해야 한다.
 *  1. xml 파일은 mapper용 인터페이스(DAO에 해당하는 인터페이스)와 같은 경로에 위치해야 한다.
 *  2. xml 파일의 namespace는 mapper용 인터페이스로 작성해야 한다.(풀네임으로)
 *  3. xml 파일명과 mapper용 인터페이스명이 동일해야 한다.
* */
public class MenuService {
    public List<MenuDTO> findAllMenu() {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = menuMapper.selectAllMenus();
        sqlSession.close();
        System.out.println("remix 방식으로 service 계층까지 잘 조회되어 오는지 확인");

        return menus;
    }

    public MenuDTO findMenuByMenuCode(int menuCode) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        MenuDTO menus = menuMapper.selectMenus(menuCode);
        sqlSession.close();

        return menus;
    }

    public boolean registMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        int menus = menuMapper.insertMenu(menu);

        if(menus > 0){
            sqlSession.commit();
        } else{
            sqlSession.rollback();
        }

        return (menus > 0) ? true : false;
    }

    public boolean modifyMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        int menus = menuMapper.updateMenu(menu);

        if(menus > 0){
            sqlSession.commit();
        } else{
            sqlSession.rollback();
        }

        return (menus > 0) ? true : false;
    }

    public boolean removeMenu(int menuCode) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        int menus = menuMapper.deleteMenu(menuCode);

        if(menus > 0){
            sqlSession.commit();
        } else{
            sqlSession.rollback();
        }

        return (menus > 0) ? true : false;
    }
}
