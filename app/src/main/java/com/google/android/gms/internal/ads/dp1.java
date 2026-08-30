package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
// jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class dp1 {

    /* renamed from: w, reason: collision with root package name */
    public static final dp1 f5474w;

    /* renamed from: x, reason: collision with root package name */
    public static final dp1 f5475x;

    /* renamed from: y, reason: collision with root package name */
    public static final dp1 f5476y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ dp1[] f5477z;

    /* renamed from: u, reason: collision with root package name */
    public final ep1 f5478u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5479v;

    /* JADX INFO: Fake field, exist only in values array */
    dp1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    dp1 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    dp1 EF0;

    static {
        dp1 dp1Var = new dp1("DOUBLE", 0, ep1.f5748x, 1);
        dp1 dp1Var2 = new dp1("FLOAT", 1, ep1.f5747w, 5);
        ep1 ep1Var = ep1.f5746v;
        dp1 dp1Var3 = new dp1("INT64", 2, ep1Var, 0);
        dp1 dp1Var4 = new dp1("UINT64", 3, ep1Var, 0);
        ep1 ep1Var2 = ep1.f5745u;
        dp1 dp1Var5 = new dp1("INT32", 4, ep1Var2, 0);
        dp1 dp1Var6 = new dp1("FIXED64", 5, ep1Var, 1);
        dp1 dp1Var7 = new dp1("FIXED32", 6, ep1Var2, 5);
        dp1 dp1Var8 = new dp1("BOOL", 7, ep1.f5749y, 0);
        dp1 dp1Var9 = new dp1("STRING", 8, ep1.f5750z, 2);
        f5474w = dp1Var9;
        ep1 ep1Var3 = ep1.C;
        dp1 dp1Var10 = new dp1("GROUP", 9, ep1Var3, 3);
        f5475x = dp1Var10;
        dp1 dp1Var11 = new dp1("MESSAGE", 10, ep1Var3, 2);
        f5476y = dp1Var11;
        f5477z = new dp1[]{dp1Var, dp1Var2, dp1Var3, dp1Var4, dp1Var5, dp1Var6, dp1Var7, dp1Var8, dp1Var9, dp1Var10, dp1Var11, new dp1("BYTES", 11, ep1.A, 2), new dp1("UINT32", 12, ep1Var2, 0), new dp1("ENUM", 13, ep1.B, 0), new dp1("SFIXED32", 14, ep1Var2, 5), new dp1("SFIXED64", 15, ep1Var, 1), new dp1("SINT32", 16, ep1Var2, 0), new dp1("SINT64", 17, ep1Var, 0)};
    }

    public dp1(String str, int i, ep1 ep1Var, int i10) {
        this.f5478u = ep1Var;
        this.f5479v = i10;
    }

    public static dp1[] values() {
        return (dp1[]) f5477z.clone();
    }
}
