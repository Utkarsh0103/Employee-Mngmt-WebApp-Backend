package com.ems.ApiGateway.services;

import java.security.Key;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

	public static final String SECRET = "28482B4D6251655468576D5A7134743777217A24432646294A404E635266556A";


    public void validateToken(final String Token) {
        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(Token);
    }



    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
