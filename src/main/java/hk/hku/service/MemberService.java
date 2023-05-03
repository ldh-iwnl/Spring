package hk.hku.service;

import hk.hku.dao.MemberDao;
import hk.hku.dao.MemberDaoImpl;

public class MemberService {
    /**
     * attribute injection
     */
    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    public void addMember(){
        // traditional way, not spring way
        System.out.println("MemberService.addMember()");
        memberDao.addMember();
    }
}
