package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;

/* loaded from: classes.dex */
public enum n6 {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);


    /* renamed from: z, reason: collision with root package name */
    public static final n6[] f14699z = new n6[26];

    /* renamed from: u, reason: collision with root package name */
    public final char f14700u;

    /* renamed from: v, reason: collision with root package name */
    public final int f14701v;

    /* renamed from: w, reason: collision with root package name */
    public final int f14702w;

    /* renamed from: x, reason: collision with root package name */
    public final String f14703x;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    static {
        /*
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r0 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r3 = 115(0x73, float:1.61E-43)
            r6 = 1
            java.lang.String r1 = "STRING"
            r2 = 0
            r4 = 1
            java.lang.String r5 = "-#"
            r0.<init>(r3, r4, r5, r6)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r1 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r4 = 98
            r7 = 1
            java.lang.String r2 = "BOOLEAN"
            r3 = 1
            r5 = 2
            java.lang.String r6 = "-"
            r1.<init>(r4, r5, r6, r7)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r5 = 99
            r8 = 1
            java.lang.String r3 = "CHAR"
            r4 = 2
            r6 = 3
            java.lang.String r7 = "-"
            r2.<init>(r5, r6, r7, r8)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r3 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r6 = 100
            r9 = 0
            java.lang.String r4 = "DECIMAL"
            r5 = 3
            r14 = 4
            java.lang.String r8 = "-0+ ,("
            r7 = r14
            r3.<init>(r6, r7, r8, r9)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r4 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r13 = 111(0x6f, float:1.56E-43)
            r16 = 0
            java.lang.String r11 = "OCTAL"
            r12 = 4
            java.lang.String r15 = "-#0("
            r10 = r4
            r10.<init>(r13, r14, r15, r16)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r5 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r13 = 120(0x78, float:1.68E-43)
            r16 = 1
            java.lang.String r11 = "HEX"
            r12 = 5
            java.lang.String r15 = "-#0("
            r10 = r5
            r10.<init>(r13, r14, r15, r16)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6.HEX = r5
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r6 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r9 = 102(0x66, float:1.43E-43)
            r12 = 0
            java.lang.String r7 = "FLOAT"
            r8 = 6
            r17 = 5
            java.lang.String r11 = "-#0+ ,("
            r10 = r17
            r6.<init>(r9, r10, r11, r12)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r7 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r16 = 101(0x65, float:1.42E-43)
            r19 = 1
            java.lang.String r14 = "EXPONENT"
            r15 = 7
            java.lang.String r18 = "-#0+ ("
            r13 = r7
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r8 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r16 = 103(0x67, float:1.44E-43)
            java.lang.String r14 = "GENERAL"
            r15 = 8
            java.lang.String r18 = "-0+ ,("
            r13 = r8
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r9 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6
            r16 = 97
            java.lang.String r14 = "EXPONENT_HEX"
            r15 = 9
            java.lang.String r18 = "-#0+ "
            r13 = r9
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6[] r0 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6.A = r0
            r0 = 26
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6[] r0 = new com.google.android.gms.internal.mlkit_vision_digital_ink.n6[r0]
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6.f14699z = r0
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6[] r0 = values()
            int r1 = r0.length
            r2 = 0
        La7:
            if (r2 >= r1) goto Lb8
            r3 = r0[r2]
            char r4 = r3.f14700u
            r4 = r4 | 32
            int r4 = r4 + (-97)
            com.google.android.gms.internal.mlkit_vision_digital_ink.n6[] r5 = com.google.android.gms.internal.mlkit_vision_digital_ink.n6.f14699z
            r5[r4] = r3
            int r2 = r2 + 1
            goto La7
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.n6.<clinit>():void");
    }

    n6(char c10, int i, String str, boolean z3) {
        int i10;
        this.f14700u = c10;
        this.f14701v = i;
        o6 o6Var = o6.e;
        if (true != z3) {
            i10 = 0;
        } else {
            i10 = 128;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            int charAt = ((int) ((o6.f14736d >>> ((str.charAt(i11) - ' ') * 3)) & 7)) - 1;
            if (charAt >= 0) {
                i10 |= 1 << charAt;
            } else {
                x.n("invalid flags: ".concat(str));
                throw null;
            }
        }
        this.f14702w = i10;
        this.f14703x = "%" + c10;
    }
}
