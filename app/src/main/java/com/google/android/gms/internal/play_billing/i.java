package com.google.android.gms.internal.play_billing;
import a0.a;
import b0.e1;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum i {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* renamed from: w, reason: collision with root package name */
    public static final a0 f15437w;

    /* renamed from: u, reason: collision with root package name */
    public final int f15439u;

    static {
        b0.e1 e1Var = new b0.e1(5, (char) 0);
        e1Var.f1180c = new Object[8];
        e1Var.f1179b = 0;
        for (i iVar : values()) {
            Integer valueOf = Integer.valueOf(iVar.f15439u);
            int i = e1Var.f1179b + 1;
            Object[] objArr = (Object[]) e1Var.f1180c;
            int length = objArr.length;
            int i10 = i + i;
            if (i10 > length) {
                if (i10 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i10) {
                        int highestOneBit = Integer.highestOneBit(i10 - 1);
                        length = highestOneBit + highestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                e1Var.f1180c = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) e1Var.f1180c;
            int i11 = e1Var.f1179b;
            int i12 = i11 + i11;
            objArr2[i12] = valueOf;
            objArr2[i12 + 1] = iVar;
            e1Var.f1179b = i11 + 1;
        }
        s sVar = (s) e1Var.f1181d;
        if (sVar == null) {
            a0 a10 = a0.a(e1Var.f1179b, (Object[]) e1Var.f1180c, e1Var);
            s sVar2 = (s) e1Var.f1181d;
            if (sVar2 == null) {
                f15437w = a10;
                return;
            }
            throw sVar2.a();
        }
        throw sVar.a();
    }

    i(int i) {
        this.f15439u = i;
    }
}
