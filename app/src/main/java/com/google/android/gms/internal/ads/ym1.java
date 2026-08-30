package com.google.android.gms.internal.ads;

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
public final class ym1 {

    /* renamed from: v, reason: collision with root package name */
    public static final ym1 f12914v;

    /* renamed from: w, reason: collision with root package name */
    public static final ym1 f12915w;

    /* renamed from: x, reason: collision with root package name */
    public static final ym1[] f12916x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ ym1[] f12917y;

    /* renamed from: u, reason: collision with root package name */
    public final int f12918u;

    /* JADX INFO: Fake field, exist only in values array */
    ym1 EF0;

    static {
        rn1 rn1Var = rn1.f10260y;
        ym1 ym1Var = new ym1("DOUBLE", 0, 0, 1, rn1Var);
        rn1 rn1Var2 = rn1.f10259x;
        ym1 ym1Var2 = new ym1("FLOAT", 1, 1, 1, rn1Var2);
        rn1 rn1Var3 = rn1.f10258w;
        ym1 ym1Var3 = new ym1("INT64", 2, 2, 1, rn1Var3);
        ym1 ym1Var4 = new ym1("UINT64", 3, 3, 1, rn1Var3);
        rn1 rn1Var4 = rn1.f10257v;
        ym1 ym1Var5 = new ym1("INT32", 4, 4, 1, rn1Var4);
        ym1 ym1Var6 = new ym1("FIXED64", 5, 5, 1, rn1Var3);
        ym1 ym1Var7 = new ym1("FIXED32", 6, 6, 1, rn1Var4);
        rn1 rn1Var5 = rn1.f10261z;
        ym1 ym1Var8 = new ym1("BOOL", 7, 7, 1, rn1Var5);
        rn1 rn1Var6 = rn1.A;
        ym1 ym1Var9 = new ym1("STRING", 8, 8, 1, rn1Var6);
        rn1 rn1Var7 = rn1.D;
        ym1 ym1Var10 = new ym1("MESSAGE", 9, 9, 1, rn1Var7);
        rn1 rn1Var8 = rn1.B;
        ym1 ym1Var11 = new ym1("BYTES", 10, 10, 1, rn1Var8);
        ym1 ym1Var12 = new ym1("UINT32", 11, 11, 1, rn1Var4);
        rn1 rn1Var9 = rn1.C;
        ym1 ym1Var13 = new ym1("ENUM", 12, 12, 1, rn1Var9);
        ym1 ym1Var14 = new ym1("SFIXED32", 13, 13, 1, rn1Var4);
        ym1 ym1Var15 = new ym1("SFIXED64", 14, 14, 1, rn1Var3);
        ym1 ym1Var16 = new ym1("SINT32", 15, 15, 1, rn1Var4);
        ym1 ym1Var17 = new ym1("SINT64", 16, 16, 1, rn1Var3);
        ym1 ym1Var18 = new ym1("GROUP", 17, 17, 1, rn1Var7);
        ym1 ym1Var19 = new ym1("DOUBLE_LIST", 18, 18, 2, rn1Var);
        ym1 ym1Var20 = new ym1("FLOAT_LIST", 19, 19, 2, rn1Var2);
        ym1 ym1Var21 = new ym1("INT64_LIST", 20, 20, 2, rn1Var3);
        ym1 ym1Var22 = new ym1("UINT64_LIST", 21, 21, 2, rn1Var3);
        ym1 ym1Var23 = new ym1("INT32_LIST", 22, 22, 2, rn1Var4);
        ym1 ym1Var24 = new ym1("FIXED64_LIST", 23, 23, 2, rn1Var3);
        ym1 ym1Var25 = new ym1("FIXED32_LIST", 24, 24, 2, rn1Var4);
        ym1 ym1Var26 = new ym1("BOOL_LIST", 25, 25, 2, rn1Var5);
        ym1 ym1Var27 = new ym1("STRING_LIST", 26, 26, 2, rn1Var6);
        ym1 ym1Var28 = new ym1("MESSAGE_LIST", 27, 27, 2, rn1Var7);
        ym1 ym1Var29 = new ym1("BYTES_LIST", 28, 28, 2, rn1Var8);
        ym1 ym1Var30 = new ym1("UINT32_LIST", 29, 29, 2, rn1Var4);
        ym1 ym1Var31 = new ym1("ENUM_LIST", 30, 30, 2, rn1Var9);
        ym1 ym1Var32 = new ym1("SFIXED32_LIST", 31, 31, 2, rn1Var4);
        ym1 ym1Var33 = new ym1("SFIXED64_LIST", 32, 32, 2, rn1Var3);
        ym1 ym1Var34 = new ym1("SINT32_LIST", 33, 33, 2, rn1Var4);
        ym1 ym1Var35 = new ym1("SINT64_LIST", 34, 34, 2, rn1Var3);
        ym1 ym1Var36 = new ym1("DOUBLE_LIST_PACKED", 35, 35, 3, rn1Var);
        f12914v = ym1Var36;
        ym1 ym1Var37 = new ym1("FLOAT_LIST_PACKED", 36, 36, 3, rn1Var2);
        ym1 ym1Var38 = new ym1("INT64_LIST_PACKED", 37, 37, 3, rn1Var3);
        ym1 ym1Var39 = new ym1("UINT64_LIST_PACKED", 38, 38, 3, rn1Var3);
        ym1 ym1Var40 = new ym1("INT32_LIST_PACKED", 39, 39, 3, rn1Var4);
        ym1 ym1Var41 = new ym1("FIXED64_LIST_PACKED", 40, 40, 3, rn1Var3);
        ym1 ym1Var42 = new ym1("FIXED32_LIST_PACKED", 41, 41, 3, rn1Var4);
        ym1 ym1Var43 = new ym1("BOOL_LIST_PACKED", 42, 42, 3, rn1Var5);
        ym1 ym1Var44 = new ym1("UINT32_LIST_PACKED", 43, 43, 3, rn1Var4);
        ym1 ym1Var45 = new ym1("ENUM_LIST_PACKED", 44, 44, 3, rn1Var9);
        ym1 ym1Var46 = new ym1("SFIXED32_LIST_PACKED", 45, 45, 3, rn1Var4);
        ym1 ym1Var47 = new ym1("SFIXED64_LIST_PACKED", 46, 46, 3, rn1Var3);
        ym1 ym1Var48 = new ym1("SINT32_LIST_PACKED", 47, 47, 3, rn1Var4);
        ym1 ym1Var49 = new ym1("SINT64_LIST_PACKED", 48, 48, 3, rn1Var3);
        f12915w = ym1Var49;
        f12917y = new ym1[]{ym1Var, ym1Var2, ym1Var3, ym1Var4, ym1Var5, ym1Var6, ym1Var7, ym1Var8, ym1Var9, ym1Var10, ym1Var11, ym1Var12, ym1Var13, ym1Var14, ym1Var15, ym1Var16, ym1Var17, ym1Var18, ym1Var19, ym1Var20, ym1Var21, ym1Var22, ym1Var23, ym1Var24, ym1Var25, ym1Var26, ym1Var27, ym1Var28, ym1Var29, ym1Var30, ym1Var31, ym1Var32, ym1Var33, ym1Var34, ym1Var35, ym1Var36, ym1Var37, ym1Var38, ym1Var39, ym1Var40, ym1Var41, ym1Var42, ym1Var43, ym1Var44, ym1Var45, ym1Var46, ym1Var47, ym1Var48, ym1Var49, new ym1("GROUP_LIST", 49, 49, 2, rn1Var7), new ym1("MAP", 50, 50, 4, rn1.f10256u)};
        ym1[] values = values();
        f12916x = new ym1[values.length];
        for (ym1 ym1Var50 : values) {
            f12916x[ym1Var50.f12918u] = ym1Var50;
        }
    }

    public ym1(String str, int i, int i10, int i11, rn1 rn1Var) {
        this.f12918u = i10;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 == 3) {
                rn1Var.getClass();
            }
        } else {
            rn1Var.getClass();
        }
        if (i11 == 1) {
            rn1 rn1Var2 = rn1.f10256u;
            rn1Var.ordinal();
        }
    }

    public static ym1[] values() {
        return (ym1[]) f12917y.clone();
    }
}
