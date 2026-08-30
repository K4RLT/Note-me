package com.google.android.gms.internal.play_billing;

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
public final class m1 {

    /* renamed from: v, reason: collision with root package name */
    public static final m1 f15484v;

    /* renamed from: w, reason: collision with root package name */
    public static final m1 f15485w;

    /* renamed from: x, reason: collision with root package name */
    public static final m1[] f15486x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ m1[] f15487y;

    /* renamed from: u, reason: collision with root package name */
    public final int f15488u;

    /* JADX INFO: Fake field, exist only in values array */
    m1 EF0;

    static {
        z1 z1Var = z1.f15563y;
        m1 m1Var = new m1("DOUBLE", 0, 0, 1, z1Var);
        z1 z1Var2 = z1.f15562x;
        m1 m1Var2 = new m1("FLOAT", 1, 1, 1, z1Var2);
        z1 z1Var3 = z1.f15561w;
        m1 m1Var3 = new m1("INT64", 2, 2, 1, z1Var3);
        m1 m1Var4 = new m1("UINT64", 3, 3, 1, z1Var3);
        z1 z1Var4 = z1.f15560v;
        m1 m1Var5 = new m1("INT32", 4, 4, 1, z1Var4);
        m1 m1Var6 = new m1("FIXED64", 5, 5, 1, z1Var3);
        m1 m1Var7 = new m1("FIXED32", 6, 6, 1, z1Var4);
        z1 z1Var5 = z1.f15564z;
        m1 m1Var8 = new m1("BOOL", 7, 7, 1, z1Var5);
        z1 z1Var6 = z1.A;
        m1 m1Var9 = new m1("STRING", 8, 8, 1, z1Var6);
        z1 z1Var7 = z1.D;
        m1 m1Var10 = new m1("MESSAGE", 9, 9, 1, z1Var7);
        z1 z1Var8 = z1.B;
        m1 m1Var11 = new m1("BYTES", 10, 10, 1, z1Var8);
        m1 m1Var12 = new m1("UINT32", 11, 11, 1, z1Var4);
        z1 z1Var9 = z1.C;
        m1 m1Var13 = new m1("ENUM", 12, 12, 1, z1Var9);
        m1 m1Var14 = new m1("SFIXED32", 13, 13, 1, z1Var4);
        m1 m1Var15 = new m1("SFIXED64", 14, 14, 1, z1Var3);
        m1 m1Var16 = new m1("SINT32", 15, 15, 1, z1Var4);
        m1 m1Var17 = new m1("SINT64", 16, 16, 1, z1Var3);
        m1 m1Var18 = new m1("GROUP", 17, 17, 1, z1Var7);
        m1 m1Var19 = new m1("DOUBLE_LIST", 18, 18, 2, z1Var);
        m1 m1Var20 = new m1("FLOAT_LIST", 19, 19, 2, z1Var2);
        m1 m1Var21 = new m1("INT64_LIST", 20, 20, 2, z1Var3);
        m1 m1Var22 = new m1("UINT64_LIST", 21, 21, 2, z1Var3);
        m1 m1Var23 = new m1("INT32_LIST", 22, 22, 2, z1Var4);
        m1 m1Var24 = new m1("FIXED64_LIST", 23, 23, 2, z1Var3);
        m1 m1Var25 = new m1("FIXED32_LIST", 24, 24, 2, z1Var4);
        m1 m1Var26 = new m1("BOOL_LIST", 25, 25, 2, z1Var5);
        m1 m1Var27 = new m1("STRING_LIST", 26, 26, 2, z1Var6);
        m1 m1Var28 = new m1("MESSAGE_LIST", 27, 27, 2, z1Var7);
        m1 m1Var29 = new m1("BYTES_LIST", 28, 28, 2, z1Var8);
        m1 m1Var30 = new m1("UINT32_LIST", 29, 29, 2, z1Var4);
        m1 m1Var31 = new m1("ENUM_LIST", 30, 30, 2, z1Var9);
        m1 m1Var32 = new m1("SFIXED32_LIST", 31, 31, 2, z1Var4);
        m1 m1Var33 = new m1("SFIXED64_LIST", 32, 32, 2, z1Var3);
        m1 m1Var34 = new m1("SINT32_LIST", 33, 33, 2, z1Var4);
        m1 m1Var35 = new m1("SINT64_LIST", 34, 34, 2, z1Var3);
        m1 m1Var36 = new m1("DOUBLE_LIST_PACKED", 35, 35, 3, z1Var);
        f15484v = m1Var36;
        m1 m1Var37 = new m1("FLOAT_LIST_PACKED", 36, 36, 3, z1Var2);
        m1 m1Var38 = new m1("INT64_LIST_PACKED", 37, 37, 3, z1Var3);
        m1 m1Var39 = new m1("UINT64_LIST_PACKED", 38, 38, 3, z1Var3);
        m1 m1Var40 = new m1("INT32_LIST_PACKED", 39, 39, 3, z1Var4);
        m1 m1Var41 = new m1("FIXED64_LIST_PACKED", 40, 40, 3, z1Var3);
        m1 m1Var42 = new m1("FIXED32_LIST_PACKED", 41, 41, 3, z1Var4);
        m1 m1Var43 = new m1("BOOL_LIST_PACKED", 42, 42, 3, z1Var5);
        m1 m1Var44 = new m1("UINT32_LIST_PACKED", 43, 43, 3, z1Var4);
        m1 m1Var45 = new m1("ENUM_LIST_PACKED", 44, 44, 3, z1Var9);
        m1 m1Var46 = new m1("SFIXED32_LIST_PACKED", 45, 45, 3, z1Var4);
        m1 m1Var47 = new m1("SFIXED64_LIST_PACKED", 46, 46, 3, z1Var3);
        m1 m1Var48 = new m1("SINT32_LIST_PACKED", 47, 47, 3, z1Var4);
        m1 m1Var49 = new m1("SINT64_LIST_PACKED", 48, 48, 3, z1Var3);
        f15485w = m1Var49;
        f15487y = new m1[]{m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6, m1Var7, m1Var8, m1Var9, m1Var10, m1Var11, m1Var12, m1Var13, m1Var14, m1Var15, m1Var16, m1Var17, m1Var18, m1Var19, m1Var20, m1Var21, m1Var22, m1Var23, m1Var24, m1Var25, m1Var26, m1Var27, m1Var28, m1Var29, m1Var30, m1Var31, m1Var32, m1Var33, m1Var34, m1Var35, m1Var36, m1Var37, m1Var38, m1Var39, m1Var40, m1Var41, m1Var42, m1Var43, m1Var44, m1Var45, m1Var46, m1Var47, m1Var48, m1Var49, new m1("GROUP_LIST", 49, 49, 2, z1Var7), new m1("MAP", 50, 50, 4, z1.f15559u)};
        m1[] values = values();
        f15486x = new m1[values.length];
        for (m1 m1Var50 : values) {
            f15486x[m1Var50.f15488u] = m1Var50;
        }
    }

    public m1(String str, int i, int i10, int i11, z1 z1Var) {
        this.f15488u = i10;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 == 3) {
                z1Var.getClass();
            }
        } else {
            z1Var.getClass();
        }
        if (i11 == 1) {
            z1 z1Var2 = z1.f15559u;
            z1Var.ordinal();
        }
    }

    public static m1[] values() {
        return (m1[]) f15487y.clone();
    }
}
