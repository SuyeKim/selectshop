package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //ㅋ카카오 아이디가 있는지 없는지 확인
    Optional<User> findByUsername(String username);
    Optional<User> findByKakaoId(Long id);
    Optional<User> findByEmail(String email);

    //이메일 중복 되었는지 혹인
}