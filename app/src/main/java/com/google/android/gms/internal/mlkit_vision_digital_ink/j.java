package com.google.android.gms.internal.mlkit_vision_digital_ink;
import pa.h;

import android.accounts.Account;
import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Account f14493a = new Account("shared", "mobstore");

    public static Account a(String str) {
        boolean z3;
        if ("shared".equals(str)) {
            return f14493a;
        }
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        h(z3, "Malformed account", new Object[0]);
        return new Account(str.substring(indexOf + 1), str.substring(0, indexOf));
    }

    public static String b(Account account) {
        boolean z3;
        boolean z9;
        boolean z10 = true;
        if (account.type.indexOf(58) == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        h(z3, "Account type contains ':'.", new Object[0]);
        if (account.type.indexOf(47) == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        h(z9, "Account type contains '/'.", new Object[0]);
        if (account.name.indexOf(47) != -1) {
            z10 = false;
        }
        h(z10, "Account name contains '/'.", new Object[0]);
        if (f14493a.equals(account)) {
            return "shared";
        }
        return wd0.n(account.type, ":", account.name);
    }
}
