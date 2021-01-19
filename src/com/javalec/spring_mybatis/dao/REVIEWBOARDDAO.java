package com.javalec.spring_mybatis.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import com.javalec.spring_mybatis.dto.Criteria;
import com.javalec.spring_mybatis.dto.RBOARDCOMMENTDTO;
import com.javalec.spring_mybatis.dto.RBOARDDTO;
import com.javalec.spring_mybatis.dto.RBOARDLIKEDTO;
import com.javalec.spring_mybatis.dto.REVIEWBOARDDTO;
import com.javalec.spring_mybatis.dto.SearchCriteria;
import com.javalec.spring_mybatis.dto.uploadFileDTO;


@Repository
public interface REVIEWBOARDDAO {



public List<RBOARDCOMMENTDTO> RAllList(int reviewboardno);


//select? xml?? resulttype? getter,setterλ§λ  DTOλ‘μ€? ?κ³? (λ°ν?)
//insert update delete? parameterType ?Όλ‘? DTOλ₯? ?€? ??€. 


//? μ²΄μ ?
public List<REVIEWBOARDDTO> RselectAll();
//κΈ???±
public void Rinsert(REVIEWBOARDDTO dto);
//??Έλ³΄κΈ°
public REVIEWBOARDDTO RselectOne(int reviewboardno); 
//?­? 
public int Rdelete(int reviewboardno);
//? μ²΄μ­? 
public int RmultiDelete(String[] seq);
//?? 

public void Rrboard_update(REVIEWBOARDDTO dto);


//μ‘°ν? ??°?΄?Έ
public int RupdateReadcount(int readcount, int reviewboardno);
//?κΈ?? ??°?΄?Έ
public int RupdateComment(int reviewboardno);

//??Ό?λ‘λ
public void RuploadFile(HashMap<String, Object> hm);

//board_detail?? ?λ‘λ? ??Ό λ³΄κΈ°
public List<uploadFileDTO> RgetFileList(int reviewboardno);





//rboardμ§μ
public List<REVIEWBOARDDTO> RlistRboard(Criteria cri);

//κ²μλ¬? μ΄? κ°??
public int RlistCount();

//μ‘°ν? ???? ? ? ¬
public List<REVIEWBOARDDTO> Rorderbyreadcount(Criteria cri);
//?κΈ?? λ§μ?? ? ? ¬
public List<REVIEWBOARDDTO> Rorderbycommentcount(Criteria bs);




//κ²?? μ‘°κ±΄? λ§κ²
public List<REVIEWBOARDDTO> RlistSearch(SearchCriteria bs);


//κ²??? κ²μλ¬? μ΄? κ°??
public int RcountSearch(SearchCriteria bs);

//μ‘°ν? ???? ? ? ¬
public List<REVIEWBOARDDTO> Rsearchorderbyreadcount(SearchCriteria cri);
//?κΈ?? λ§μ?? ? ? ¬
public List<REVIEWBOARDDTO> Rsearchorderbycommentcount(SearchCriteria bs);






//μ‘°ν?
public int RboardHit(int reviewboardno);

//μ’μ?
public int RlikeCheck(Map<String, Object> m);

//μ’μ? κ°μ
public int RlikeCount(int reviewboardno);

public void RinsertBoardLike(RBOARDLIKEDTO dto);

public void RdeleteBoardLike(RBOARDLIKEDTO dto);






//?Ή?  ??΄?λ‘? ??±? κΈ?
public List<REVIEWBOARDDTO> Rmadeby(String id);


}
