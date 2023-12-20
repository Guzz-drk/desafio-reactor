package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        Long countUserAdmin = 0L;
        for(User user : users){
            if(user.isAdmin()){
                countUserAdmin += 1L;
            }
        }
        return Mono.just(countUserAdmin);
    }

}
