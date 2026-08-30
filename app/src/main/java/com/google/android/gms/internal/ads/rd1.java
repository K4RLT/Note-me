package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class rd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gl1 f10213b = gl1.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10214a;

    public /* synthetic */ rd1(HashMap hashMap) {
        this.f10214a = hashMap;
    }

    public final Iterable a(byte[] bArr) {
        List list;
        gl1 gl1Var = f10213b;
        HashMap hashMap = this.f10214a;
        List list2 = (List) hashMap.get(gl1Var);
        int i = 5;
        if (bArr.length >= 5) {
            int length = bArr.length;
            if (5 > length) {
                i = length;
            }
            list = (List) hashMap.get(new gl1(bArr, i));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        if (list == null) {
            return list2;
        }
        return new pd1(this, list, list2);
    }
}
