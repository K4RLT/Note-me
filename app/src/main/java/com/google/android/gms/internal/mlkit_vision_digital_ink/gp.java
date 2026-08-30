package com.google.android.gms.internal.mlkit_vision_digital_ink;

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
public final class gp {
    public static final /* synthetic */ gp[] A;

    /* renamed from: w, reason: collision with root package name */
    public static final gp f14373w;

    /* renamed from: x, reason: collision with root package name */
    public static final gp f14374x;

    /* renamed from: y, reason: collision with root package name */
    public static final gp f14375y;

    /* renamed from: z, reason: collision with root package name */
    public static final gp f14376z;

    /* renamed from: u, reason: collision with root package name */
    public final hp f14377u;

    /* renamed from: v, reason: collision with root package name */
    public final int f14378v;

    /* JADX INFO: Fake field, exist only in values array */
    gp EF1;

    /* JADX INFO: Fake field, exist only in values array */
    gp EF2;

    /* JADX INFO: Fake field, exist only in values array */
    gp EF0;

    static {
        gp gpVar = new gp("DOUBLE", 0, hp.f14434x, 1);
        gp gpVar2 = new gp("FLOAT", 1, hp.f14433w, 5);
        hp hpVar = hp.f14432v;
        gp gpVar3 = new gp("INT64", 2, hpVar, 0);
        gp gpVar4 = new gp("UINT64", 3, hpVar, 0);
        hp hpVar2 = hp.f14431u;
        gp gpVar5 = new gp("INT32", 4, hpVar2, 0);
        gp gpVar6 = new gp("FIXED64", 5, hpVar, 1);
        gp gpVar7 = new gp("FIXED32", 6, hpVar2, 5);
        gp gpVar8 = new gp("BOOL", 7, hp.f14435y, 0);
        gp gpVar9 = new gp("STRING", 8, hp.f14436z, 2);
        f14373w = gpVar9;
        hp hpVar3 = hp.C;
        gp gpVar10 = new gp("GROUP", 9, hpVar3, 3);
        f14374x = gpVar10;
        gp gpVar11 = new gp("MESSAGE", 10, hpVar3, 2);
        f14375y = gpVar11;
        gp gpVar12 = new gp("BYTES", 11, hp.A, 2);
        gp gpVar13 = new gp("UINT32", 12, hpVar2, 0);
        gp gpVar14 = new gp("ENUM", 13, hp.B, 0);
        f14376z = gpVar14;
        A = new gp[]{gpVar, gpVar2, gpVar3, gpVar4, gpVar5, gpVar6, gpVar7, gpVar8, gpVar9, gpVar10, gpVar11, gpVar12, gpVar13, gpVar14, new gp("SFIXED32", 14, hpVar2, 5), new gp("SFIXED64", 15, hpVar, 1), new gp("SINT32", 16, hpVar2, 0), new gp("SINT64", 17, hpVar, 0)};
    }

    public gp(String str, int i, hp hpVar, int i10) {
        this.f14377u = hpVar;
        this.f14378v = i10;
    }

    public static gp[] values() {
        return (gp[]) A.clone();
    }
}
