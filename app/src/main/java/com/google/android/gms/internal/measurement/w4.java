package com.google.android.gms.internal.measurement;
import q0.d;

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
public final class w4 {

    /* renamed from: v, reason: collision with root package name */
    public static final w4 f13954v;

    /* renamed from: w, reason: collision with root package name */
    public static final w4 f13955w;

    /* renamed from: x, reason: collision with root package name */
    public static final w4[] f13956x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w4[] f13957y;

    /* renamed from: u, reason: collision with root package name */
    public final int f13958u;

    /* JADX INFO: Fake field, exist only in values array */
    w4 EF0;

    static {
        j5 j5Var = j5.f13790y;
        w4 w4Var = new w4("DOUBLE", 0, 0, 1, j5Var);
        j5 j5Var2 = j5.f13789x;
        w4 w4Var2 = new w4("FLOAT", 1, 1, 1, j5Var2);
        j5 j5Var3 = j5.f13788w;
        w4 w4Var3 = new w4("INT64", 2, 2, 1, j5Var3);
        w4 w4Var4 = new w4("UINT64", 3, 3, 1, j5Var3);
        j5 j5Var4 = j5.f13787v;
        w4 w4Var5 = new w4("INT32", 4, 4, 1, j5Var4);
        w4 w4Var6 = new w4("FIXED64", 5, 5, 1, j5Var3);
        w4 w4Var7 = new w4("FIXED32", 6, 6, 1, j5Var4);
        j5 j5Var5 = j5.f13791z;
        w4 w4Var8 = new w4("BOOL", 7, 7, 1, j5Var5);
        j5 j5Var6 = j5.A;
        w4 w4Var9 = new w4("STRING", 8, 8, 1, j5Var6);
        j5 j5Var7 = j5.D;
        w4 w4Var10 = new w4("MESSAGE", 9, 9, 1, j5Var7);
        j5 j5Var8 = j5.B;
        w4 w4Var11 = new w4("BYTES", 10, 10, 1, j5Var8);
        w4 w4Var12 = new w4("UINT32", 11, 11, 1, j5Var4);
        j5 j5Var9 = j5.C;
        w4 w4Var13 = new w4("ENUM", 12, 12, 1, j5Var9);
        w4 w4Var14 = new w4("SFIXED32", 13, 13, 1, j5Var4);
        w4 w4Var15 = new w4("SFIXED64", 14, 14, 1, j5Var3);
        w4 w4Var16 = new w4("SINT32", 15, 15, 1, j5Var4);
        w4 w4Var17 = new w4("SINT64", 16, 16, 1, j5Var3);
        w4 w4Var18 = new w4("GROUP", 17, 17, 1, j5Var7);
        w4 w4Var19 = new w4("DOUBLE_LIST", 18, 18, 2, j5Var);
        w4 w4Var20 = new w4("FLOAT_LIST", 19, 19, 2, j5Var2);
        w4 w4Var21 = new w4("INT64_LIST", 20, 20, 2, j5Var3);
        w4 w4Var22 = new w4("UINT64_LIST", 21, 21, 2, j5Var3);
        w4 w4Var23 = new w4("INT32_LIST", 22, 22, 2, j5Var4);
        w4 w4Var24 = new w4("FIXED64_LIST", 23, 23, 2, j5Var3);
        w4 w4Var25 = new w4("FIXED32_LIST", 24, 24, 2, j5Var4);
        w4 w4Var26 = new w4("BOOL_LIST", 25, 25, 2, j5Var5);
        w4 w4Var27 = new w4("STRING_LIST", 26, 26, 2, j5Var6);
        w4 w4Var28 = new w4("MESSAGE_LIST", 27, 27, 2, j5Var7);
        w4 w4Var29 = new w4("BYTES_LIST", 28, 28, 2, j5Var8);
        w4 w4Var30 = new w4("UINT32_LIST", 29, 29, 2, j5Var4);
        w4 w4Var31 = new w4("ENUM_LIST", 30, 30, 2, j5Var9);
        w4 w4Var32 = new w4("SFIXED32_LIST", 31, 31, 2, j5Var4);
        w4 w4Var33 = new w4("SFIXED64_LIST", 32, 32, 2, j5Var3);
        w4 w4Var34 = new w4("SINT32_LIST", 33, 33, 2, j5Var4);
        w4 w4Var35 = new w4("SINT64_LIST", 34, 34, 2, j5Var3);
        w4 w4Var36 = new w4("DOUBLE_LIST_PACKED", 35, 35, 3, j5Var);
        f13954v = w4Var36;
        w4 w4Var37 = new w4("FLOAT_LIST_PACKED", 36, 36, 3, j5Var2);
        w4 w4Var38 = new w4("INT64_LIST_PACKED", 37, 37, 3, j5Var3);
        w4 w4Var39 = new w4("UINT64_LIST_PACKED", 38, 38, 3, j5Var3);
        w4 w4Var40 = new w4("INT32_LIST_PACKED", 39, 39, 3, j5Var4);
        w4 w4Var41 = new w4("FIXED64_LIST_PACKED", 40, 40, 3, j5Var3);
        w4 w4Var42 = new w4("FIXED32_LIST_PACKED", 41, 41, 3, j5Var4);
        w4 w4Var43 = new w4("BOOL_LIST_PACKED", 42, 42, 3, j5Var5);
        w4 w4Var44 = new w4("UINT32_LIST_PACKED", 43, 43, 3, j5Var4);
        w4 w4Var45 = new w4("ENUM_LIST_PACKED", 44, 44, 3, j5Var9);
        w4 w4Var46 = new w4("SFIXED32_LIST_PACKED", 45, 45, 3, j5Var4);
        w4 w4Var47 = new w4("SFIXED64_LIST_PACKED", 46, 46, 3, j5Var3);
        w4 w4Var48 = new w4("SINT32_LIST_PACKED", 47, 47, 3, j5Var4);
        w4 w4Var49 = new w4("SINT64_LIST_PACKED", 48, 48, 3, j5Var3);
        f13955w = w4Var49;
        f13957y = new w4[]{w4Var, w4Var2, w4Var3, w4Var4, w4Var5, w4Var6, w4Var7, w4Var8, w4Var9, w4Var10, w4Var11, w4Var12, w4Var13, w4Var14, w4Var15, w4Var16, w4Var17, w4Var18, w4Var19, w4Var20, w4Var21, w4Var22, w4Var23, w4Var24, w4Var25, w4Var26, w4Var27, w4Var28, w4Var29, w4Var30, w4Var31, w4Var32, w4Var33, w4Var34, w4Var35, w4Var36, w4Var37, w4Var38, w4Var39, w4Var40, w4Var41, w4Var42, w4Var43, w4Var44, w4Var45, w4Var46, w4Var47, w4Var48, w4Var49, new w4("GROUP_LIST", 49, 49, 2, j5Var7), new w4("MAP", 50, 50, 4, j5.f13786u)};
        w4[] values = values();
        f13956x = new w4[values.length];
        for (w4 w4Var50 : values) {
            f13956x[w4Var50.f13958u] = w4Var50;
        }
    }

    public w4(String str, int i, int i10, int i11, j5 j5Var) {
        this.f13958u = i10;
        int b10 = d.b(i11);
        if (b10 != 1) {
            if (b10 == 3) {
                j5Var.getClass();
            }
        } else {
            j5Var.getClass();
        }
        if (i11 == 1) {
            int i12 = x4.f13968a[j5Var.ordinal()];
        }
    }

    public static w4[] values() {
        return (w4[]) f13957y.clone();
    }
}
