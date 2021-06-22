package com.okta.spring.boot.nativehints;

import org.springframework.nativex.hint.AccessBits;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.ResourceHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.type.HintDeclaration;
import org.springframework.nativex.type.NativeConfiguration;
import org.springframework.nativex.type.TypeSystem;

import java.util.Collections;
import java.util.List;

@NativeHint(
    options = "--enable-url-protocols=https",
    resources = {
        @ResourceHint(patterns = "com/okta/commons/configcheck/configuration-validator", isBundle = true),
        @ResourceHint(patterns = "com/okta/spring/boot/oauth/OktaOpaqueTokenIntrospectConditional.ClientIdCondition.class"),
        @ResourceHint(patterns = "com/okta/spring/boot/oauth/OktaOpaqueTokenIntrospectConditional.ClientSecretCondition.class"),
        @ResourceHint(patterns = "com/okta/spring/boot/oauth/OktaOpaqueTokenIntrospectConditional.IntrospectionUriCondition.class")},
    types = @TypeHint(
        access = AccessBits.ALL,
        typeNames = {
            "com.okta.spring.boot.oauth.OktaOpaqueTokenIntrospectConditional",
            "com.okta.spring.boot.oauth.OktaOpaqueTokenIntrospectConditional$ClientIdCondition",
            "com.okta.spring.boot.oauth.OktaOpaqueTokenIntrospectConditional$ClientSecretCondition",
            "com.okta.spring.boot.oauth.OktaOpaqueTokenIntrospectConditional$IntrospectionUriCondition"
        }
    )
)
public class OktaHints implements NativeConfiguration {

    @Override
    public List<HintDeclaration> computeHints(TypeSystem typeSystem) {
        System.out.println("Hello from Okta Hints");
        return Collections.emptyList();
    }

}
