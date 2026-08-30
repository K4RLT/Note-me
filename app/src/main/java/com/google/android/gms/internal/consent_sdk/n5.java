package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class n5 {

    /* renamed from: v, reason: collision with root package name */
    public static final n5 f13501v;

    /* renamed from: w, reason: collision with root package name */
    public static final n5 f13502w;

    /* renamed from: x, reason: collision with root package name */
    public static final n5[] f13503x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ n5[] f13504y;

    /* renamed from: u, reason: collision with root package name */
    public final int f13505u;

    /* JADX INFO: Fake field, exist only in values array */
    n5 EF0;

    static {
        v5 v5Var = v5.f13585y;
        n5 n5Var = new n5("DOUBLE", 0, 0, 1, v5Var);
        v5 v5Var2 = v5.f13584x;
        n5 n5Var2 = new n5("FLOAT", 1, 1, 1, v5Var2);
        v5 v5Var3 = v5.f13583w;
        n5 n5Var3 = new n5("INT64", 2, 2, 1, v5Var3);
        n5 n5Var4 = new n5("UINT64", 3, 3, 1, v5Var3);
        v5 v5Var4 = v5.f13582v;
        n5 n5Var5 = new n5("INT32", 4, 4, 1, v5Var4);
        n5 n5Var6 = new n5("FIXED64", 5, 5, 1, v5Var3);
        n5 n5Var7 = new n5("FIXED32", 6, 6, 1, v5Var4);
        v5 v5Var5 = v5.f13586z;
        n5 n5Var8 = new n5("BOOL", 7, 7, 1, v5Var5);
        v5 v5Var6 = v5.A;
        n5 n5Var9 = new n5("STRING", 8, 8, 1, v5Var6);
        v5 v5Var7 = v5.D;
        n5 n5Var10 = new n5("MESSAGE", 9, 9, 1, v5Var7);
        v5 v5Var8 = v5.B;
        n5 n5Var11 = new n5("BYTES", 10, 10, 1, v5Var8);
        n5 n5Var12 = new n5("UINT32", 11, 11, 1, v5Var4);
        v5 v5Var9 = v5.C;
        n5 n5Var13 = new n5("ENUM", 12, 12, 1, v5Var9);
        n5 n5Var14 = new n5("SFIXED32", 13, 13, 1, v5Var4);
        n5 n5Var15 = new n5("SFIXED64", 14, 14, 1, v5Var3);
        n5 n5Var16 = new n5("SINT32", 15, 15, 1, v5Var4);
        n5 n5Var17 = new n5("SINT64", 16, 16, 1, v5Var3);
        n5 n5Var18 = new n5("GROUP", 17, 17, 1, v5Var7);
        n5 n5Var19 = new n5("DOUBLE_LIST", 18, 18, 2, v5Var);
        n5 n5Var20 = new n5("FLOAT_LIST", 19, 19, 2, v5Var2);
        n5 n5Var21 = new n5("INT64_LIST", 20, 20, 2, v5Var3);
        n5 n5Var22 = new n5("UINT64_LIST", 21, 21, 2, v5Var3);
        n5 n5Var23 = new n5("INT32_LIST", 22, 22, 2, v5Var4);
        n5 n5Var24 = new n5("FIXED64_LIST", 23, 23, 2, v5Var3);
        n5 n5Var25 = new n5("FIXED32_LIST", 24, 24, 2, v5Var4);
        n5 n5Var26 = new n5("BOOL_LIST", 25, 25, 2, v5Var5);
        n5 n5Var27 = new n5("STRING_LIST", 26, 26, 2, v5Var6);
        n5 n5Var28 = new n5("MESSAGE_LIST", 27, 27, 2, v5Var7);
        n5 n5Var29 = new n5("BYTES_LIST", 28, 28, 2, v5Var8);
        n5 n5Var30 = new n5("UINT32_LIST", 29, 29, 2, v5Var4);
        n5 n5Var31 = new n5("ENUM_LIST", 30, 30, 2, v5Var9);
        n5 n5Var32 = new n5("SFIXED32_LIST", 31, 31, 2, v5Var4);
        n5 n5Var33 = new n5("SFIXED64_LIST", 32, 32, 2, v5Var3);
        n5 n5Var34 = new n5("SINT32_LIST", 33, 33, 2, v5Var4);
        n5 n5Var35 = new n5("SINT64_LIST", 34, 34, 2, v5Var3);
        n5 n5Var36 = new n5("DOUBLE_LIST_PACKED", 35, 35, 3, v5Var);
        f13501v = n5Var36;
        n5 n5Var37 = new n5("FLOAT_LIST_PACKED", 36, 36, 3, v5Var2);
        n5 n5Var38 = new n5("INT64_LIST_PACKED", 37, 37, 3, v5Var3);
        n5 n5Var39 = new n5("UINT64_LIST_PACKED", 38, 38, 3, v5Var3);
        n5 n5Var40 = new n5("INT32_LIST_PACKED", 39, 39, 3, v5Var4);
        n5 n5Var41 = new n5("FIXED64_LIST_PACKED", 40, 40, 3, v5Var3);
        n5 n5Var42 = new n5("FIXED32_LIST_PACKED", 41, 41, 3, v5Var4);
        n5 n5Var43 = new n5("BOOL_LIST_PACKED", 42, 42, 3, v5Var5);
        n5 n5Var44 = new n5("UINT32_LIST_PACKED", 43, 43, 3, v5Var4);
        n5 n5Var45 = new n5("ENUM_LIST_PACKED", 44, 44, 3, v5Var9);
        n5 n5Var46 = new n5("SFIXED32_LIST_PACKED", 45, 45, 3, v5Var4);
        n5 n5Var47 = new n5("SFIXED64_LIST_PACKED", 46, 46, 3, v5Var3);
        n5 n5Var48 = new n5("SINT32_LIST_PACKED", 47, 47, 3, v5Var4);
        n5 n5Var49 = new n5("SINT64_LIST_PACKED", 48, 48, 3, v5Var3);
        f13502w = n5Var49;
        f13504y = new n5[]{n5Var, n5Var2, n5Var3, n5Var4, n5Var5, n5Var6, n5Var7, n5Var8, n5Var9, n5Var10, n5Var11, n5Var12, n5Var13, n5Var14, n5Var15, n5Var16, n5Var17, n5Var18, n5Var19, n5Var20, n5Var21, n5Var22, n5Var23, n5Var24, n5Var25, n5Var26, n5Var27, n5Var28, n5Var29, n5Var30, n5Var31, n5Var32, n5Var33, n5Var34, n5Var35, n5Var36, n5Var37, n5Var38, n5Var39, n5Var40, n5Var41, n5Var42, n5Var43, n5Var44, n5Var45, n5Var46, n5Var47, n5Var48, n5Var49, new n5("GROUP_LIST", 49, 49, 2, v5Var7), new n5("MAP", 50, 50, 4, v5.f13581u)};
        n5[] values = values();
        f13503x = new n5[values.length];
        for (n5 n5Var50 : values) {
            f13503x[n5Var50.f13505u] = n5Var50;
        }
    }

    public n5(String str, int i, int i10, int i11, v5 v5Var) {
        this.f13505u = i10;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 == 3) {
                v5Var.getClass();
            }
        } else {
            v5Var.getClass();
        }
        if (i11 == 1) {
            v5 v5Var2 = v5.f13581u;
            v5Var.ordinal();
        }
    }

    public static n5[] values() {
        return (n5[]) f13504y.clone();
    }
}
