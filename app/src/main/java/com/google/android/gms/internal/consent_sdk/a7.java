package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'w' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class a7 {

    /* renamed from: w, reason: collision with root package name */
    public static final a7 f13355w;

    /* renamed from: x, reason: collision with root package name */
    public static final a7 f13356x;

    /* renamed from: y, reason: collision with root package name */
    public static final a7 f13357y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a7[] f13358z;

    /* renamed from: u, reason: collision with root package name */
    public final b7 f13359u;

    /* renamed from: v, reason: collision with root package name */
    public final int f13360v;

    /* JADX INFO: Fake field, exist only in values array */
    a7 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    a7 EF2;

    static {
        a7 a7Var = new a7("DOUBLE", 0, b7.f13367x, 1);
        a7 a7Var2 = new a7("FLOAT", 1, b7.f13366w, 5);
        b7 b7Var = b7.f13365v;
        a7 a7Var3 = new a7("INT64", 2, b7Var, 0);
        f13355w = a7Var3;
        a7 a7Var4 = new a7("UINT64", 3, b7Var, 0);
        b7 b7Var2 = b7.f13364u;
        a7 a7Var5 = new a7("INT32", 4, b7Var2, 0);
        a7 a7Var6 = new a7("FIXED64", 5, b7Var, 1);
        a7 a7Var7 = new a7("FIXED32", 6, b7Var2, 5);
        a7 a7Var8 = new a7("BOOL", 7, b7.f13368y, 0);
        a7 a7Var9 = new a7("STRING", 8, b7.f13369z, 2);
        f13356x = a7Var9;
        b7 b7Var3 = b7.C;
        a7 a7Var10 = new a7("GROUP", 9, b7Var3, 3);
        f13357y = a7Var10;
        f13358z = new a7[]{a7Var, a7Var2, a7Var3, a7Var4, a7Var5, a7Var6, a7Var7, a7Var8, a7Var9, a7Var10, new a7("MESSAGE", 10, b7Var3, 2), new a7("BYTES", 11, b7.A, 2), new a7("UINT32", 12, b7Var2, 0), new a7("ENUM", 13, b7.B, 0), new a7("SFIXED32", 14, b7Var2, 5), new a7("SFIXED64", 15, b7Var, 1), new a7("SINT32", 16, b7Var2, 0), new a7("SINT64", 17, b7Var, 0)};
    }

    public a7(String str, int i, b7 b7Var, int i10) {
        this.f13359u = b7Var;
        this.f13360v = i10;
    }

    public static a7[] values() {
        return (a7[]) f13358z.clone();
    }
}
