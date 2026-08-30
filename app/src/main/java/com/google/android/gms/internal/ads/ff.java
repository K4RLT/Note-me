package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ff implements cf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf f6054b;

    public /* synthetic */ ff(hf hfVar, int i) {
        this.f6053a = i;
        this.f6054b = hfVar;
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        hf hfVar = this.f6054b;
        int i = ~hfVar.B;
        hfVar.B = i;
        int i10 = hfVar.M1 ^ hfVar.K1;
        int i11 = hfVar.f6795y;
        int i12 = ((((i10 | i11) ^ hfVar.O) ^ hfVar.f6748l2) ^ hfVar.W0) ^ hfVar.P;
        hfVar.P = i12;
        int i13 = hfVar.G;
        int i14 = hfVar.I0;
        int i15 = ~i14;
        int i16 = i13 & i15;
        int i17 = i13 ^ i16;
        hfVar.W0 = i17;
        int i18 = hfVar.f6709b;
        int i19 = hfVar.f6773s0;
        int i20 = hfVar.f6791x;
        int i21 = (((i16 ^ i18) | i19) ^ i20) ^ hfVar.f6782u1;
        hfVar.f6782u1 = i21;
        int i22 = i18 ^ i13;
        hfVar.f6748l2 = i22;
        int i23 = i15 & i22;
        int i24 = (i19 | i23) ^ hfVar.H1;
        hfVar.O = i24;
        int i25 = (i20 ^ ((~i23) & i19)) | i11;
        int i26 = (i14 | i22) ^ i18;
        int i27 = i19 | i26;
        int i28 = hfVar.f6732h0 ^ i27;
        hfVar.f6709b = i28;
        int i29 = hfVar.f6722e2 ^ i28;
        int i30 = hfVar.f6798y2;
        int i31 = ((i29 | i30) ^ i21) ^ hfVar.L;
        hfVar.L = i31;
        int i32 = hfVar.f6733h1 ^ (((i19 & i26) ^ i26) | i11);
        hfVar.f6722e2 = i32;
        int i33 = i26 ^ (i19 & i23);
        hfVar.K1 = i33;
        int i34 = i33 ^ i25;
        hfVar.H1 = i34;
        int i35 = ~i11;
        int i36 = (i32 ^ ((((i17 ^ i27) & i35) ^ hfVar.D) | i30)) ^ hfVar.f6734h2;
        hfVar.f6734h2 = i36;
        int i37 = (hfVar.R0 ^ i23) ^ hfVar.Y0;
        hfVar.Y0 = i37;
        int i38 = ((i37 ^ (i37 & i35)) | i30) ^ hfVar.C;
        hfVar.f6791x = i38;
        int i39 = i38 ^ hfVar.f6760p;
        hfVar.f6760p = i39;
        int i40 = (((((((i23 ^ hfVar.M) | i19) ^ i13) & i35) ^ i24) | i30) ^ i34) ^ hfVar.f6776t;
        hfVar.f6776t = i40;
        int i41 = hfVar.i;
        int i42 = ((~i13) & i41) ^ hfVar.f6767q2;
        hfVar.I0 = i42;
        int i43 = (((i11 & i42) ^ hfVar.f6725f1) | hfVar.f6777t0) ^ hfVar.E;
        int i44 = hfVar.F0;
        int i45 = (i43 & i44) ^ hfVar.f6774s1;
        hfVar.f6795y = i45;
        int i46 = i45 ^ hfVar.F;
        hfVar.F = i46;
        bArr2[0] = (byte) (i36 & 255);
        bArr2[1] = (byte) ((i36 >>> 8) & 255);
        bArr2[2] = (byte) ((i36 >>> 16) & 255);
        bArr2[3] = (byte) (i36 >> 24);
        int i47 = hfVar.f6750m1;
        bArr2[4] = (byte) (i47 & 255);
        bArr2[5] = (byte) ((i47 >>> 8) & 255);
        bArr2[6] = (byte) ((i47 >>> 16) & 255);
        bArr2[7] = (byte) (i47 >> 24);
        int i48 = hfVar.f6717d;
        bArr2[8] = (byte) (i48 & 255);
        bArr2[9] = (byte) ((i48 >>> 8) & 255);
        bArr2[10] = (byte) ((i48 >>> 16) & 255);
        bArr2[11] = (byte) (i48 >> 24);
        int i49 = hfVar.R;
        bArr2[12] = (byte) (i49 & 255);
        bArr2[13] = (byte) ((i49 >>> 8) & 255);
        bArr2[14] = (byte) ((i49 >>> 16) & 255);
        bArr2[15] = (byte) (i49 >> 24);
        int i50 = hfVar.f6723f;
        bArr2[16] = (byte) (i50 & 255);
        bArr2[17] = (byte) ((i50 >>> 8) & 255);
        bArr2[18] = (byte) ((i50 >>> 16) & 255);
        bArr2[19] = (byte) (i50 >> 24);
        int i51 = hfVar.f6739j0;
        bArr2[20] = (byte) (i51 & 255);
        bArr2[21] = (byte) ((i51 >>> 8) & 255);
        bArr2[22] = (byte) ((i51 >>> 16) & 255);
        bArr2[23] = (byte) (i51 >> 24);
        int i52 = hfVar.C1;
        bArr2[24] = (byte) (i52 & 255);
        bArr2[25] = (byte) ((i52 >>> 8) & 255);
        bArr2[26] = (byte) ((i52 >>> 16) & 255);
        bArr2[27] = (byte) (i52 >> 24);
        int i53 = hfVar.f6770r1;
        bArr2[28] = (byte) (i53 & 255);
        bArr2[29] = (byte) ((i53 >>> 8) & 255);
        bArr2[30] = (byte) ((i53 >>> 16) & 255);
        bArr2[31] = (byte) (i53 >> 24);
        int i54 = hfVar.f6738j;
        bArr2[32] = (byte) (i54 & 255);
        bArr2[33] = (byte) ((i54 >>> 8) & 255);
        bArr2[34] = (byte) ((i54 >>> 16) & 255);
        bArr2[35] = (byte) (i54 >> 24);
        bArr2[36] = (byte) (i41 & 255);
        bArr2[37] = (byte) ((i41 >>> 8) & 255);
        bArr2[38] = (byte) ((i41 >>> 16) & 255);
        bArr2[39] = (byte) (i41 >> 24);
        int i55 = hfVar.f6775s2;
        bArr2[40] = (byte) (i55 & 255);
        bArr2[41] = (byte) ((i55 >>> 8) & 255);
        bArr2[42] = (byte) ((i55 >>> 16) & 255);
        bArr2[43] = (byte) (i55 >> 24);
        int i56 = hfVar.P1;
        bArr2[44] = (byte) (i56 & 255);
        bArr2[45] = (byte) ((i56 >>> 8) & 255);
        bArr2[46] = (byte) ((i56 >>> 16) & 255);
        bArr2[47] = (byte) (i56 >> 24);
        int i57 = hfVar.I1;
        bArr2[48] = (byte) (i57 & 255);
        bArr2[49] = (byte) ((i57 >>> 8) & 255);
        bArr2[50] = (byte) ((i57 >>> 16) & 255);
        bArr2[51] = (byte) (i57 >> 24);
        int i58 = hfVar.f6796y0;
        bArr2[52] = (byte) (i58 & 255);
        bArr2[53] = (byte) ((i58 >>> 8) & 255);
        bArr2[54] = (byte) ((i58 >>> 16) & 255);
        bArr2[55] = (byte) (i58 >> 24);
        bArr2[56] = (byte) (i39 & 255);
        bArr2[57] = (byte) ((i39 >>> 8) & 255);
        bArr2[58] = (byte) ((i39 >>> 16) & 255);
        bArr2[59] = (byte) (i39 >> 24);
        int i59 = hfVar.W;
        bArr2[60] = (byte) (i59 & 255);
        bArr2[61] = (byte) ((i59 >>> 8) & 255);
        bArr2[62] = (byte) ((i59 >>> 16) & 255);
        bArr2[63] = (byte) (i59 >> 24);
        int i60 = hfVar.f6768r;
        bArr2[64] = (byte) (i60 & 255);
        bArr2[65] = (byte) ((i60 >>> 8) & 255);
        bArr2[66] = (byte) ((i60 >>> 16) & 255);
        bArr2[67] = (byte) (i60 >> 24);
        int i61 = hfVar.f6764q;
        bArr2[68] = (byte) (i61 & 255);
        bArr2[69] = (byte) ((i61 >>> 8) & 255);
        bArr2[70] = (byte) ((i61 >>> 16) & 255);
        bArr2[71] = (byte) (i61 >> 24);
        bArr2[72] = (byte) (i40 & 255);
        bArr2[73] = (byte) ((i40 >>> 8) & 255);
        bArr2[74] = (byte) ((i40 >>> 16) & 255);
        bArr2[75] = (byte) (i40 >> 24);
        int i62 = hfVar.f6715c1;
        bArr2[76] = (byte) (i62 & 255);
        bArr2[77] = (byte) ((i62 >>> 8) & 255);
        bArr2[78] = (byte) ((i62 >>> 16) & 255);
        bArr2[79] = (byte) (i62 >> 24);
        int i63 = hfVar.f6784v;
        bArr2[80] = (byte) (i63 & 255);
        bArr2[81] = (byte) ((i63 >>> 8) & 255);
        bArr2[82] = (byte) ((i63 >>> 16) & 255);
        bArr2[83] = (byte) (i63 >> 24);
        int i64 = hfVar.f6780u;
        bArr2[84] = (byte) (i64 & 255);
        bArr2[85] = (byte) ((i64 >>> 8) & 255);
        bArr2[86] = (byte) ((i64 >>> 16) & 255);
        bArr2[87] = (byte) (i64 >> 24);
        int i65 = hfVar.f6707a1;
        bArr2[88] = (byte) (i65 & 255);
        bArr2[89] = (byte) ((i65 >>> 8) & 255);
        bArr2[90] = (byte) ((i65 >>> 16) & 255);
        bArr2[91] = (byte) (i65 >> 24);
        int i66 = hfVar.f6757o0;
        bArr2[92] = (byte) (i66 & 255);
        bArr2[93] = (byte) ((i66 >>> 8) & 255);
        bArr2[94] = (byte) ((i66 >>> 16) & 255);
        bArr2[95] = (byte) (i66 >> 24);
        int i67 = hfVar.f6763p2;
        bArr2[96] = (byte) (i67 & 255);
        bArr2[97] = (byte) ((i67 >>> 8) & 255);
        bArr2[98] = (byte) ((i67 >>> 16) & 255);
        bArr2[99] = (byte) (i67 >> 24);
        int i68 = hfVar.f6758o1;
        bArr2[100] = (byte) (i68 & 255);
        bArr2[101] = (byte) ((i68 >>> 8) & 255);
        bArr2[102] = (byte) ((i68 >>> 16) & 255);
        bArr2[103] = (byte) (i68 >> 24);
        bArr2[104] = (byte) (i & 255);
        bArr2[105] = (byte) ((i >>> 8) & 255);
        bArr2[106] = (byte) ((i >>> 16) & 255);
        bArr2[107] = (byte) (i >> 24);
        int i69 = hfVar.f6785v0;
        bArr2[108] = (byte) (i69 & 255);
        bArr2[109] = (byte) ((i69 >>> 8) & 255);
        bArr2[110] = (byte) ((i69 >>> 16) & 255);
        bArr2[111] = (byte) (i69 >> 24);
        int i70 = hfVar.f6730g2;
        bArr2[112] = (byte) (i70 & 255);
        bArr2[113] = (byte) ((i70 >>> 8) & 255);
        bArr2[114] = (byte) ((i70 >>> 16) & 255);
        bArr2[115] = (byte) (i70 >> 24);
        int i71 = hfVar.Z0;
        bArr2[116] = (byte) (i71 & 255);
        bArr2[117] = (byte) ((i71 >>> 8) & 255);
        bArr2[118] = (byte) ((i71 >>> 16) & 255);
        bArr2[119] = (byte) (i71 >> 24);
        bArr2[120] = (byte) (i46 & 255);
        bArr2[121] = (byte) ((i46 >>> 8) & 255);
        bArr2[122] = (byte) ((i46 >>> 16) & 255);
        bArr2[123] = (byte) (i46 >> 24);
        int i72 = hfVar.G2;
        bArr2[124] = (byte) (i72 & 255);
        bArr2[125] = (byte) ((i72 >>> 8) & 255);
        bArr2[126] = (byte) ((i72 >>> 16) & 255);
        bArr2[127] = (byte) (i72 >> 24);
        int i73 = hfVar.f6754n1;
        bArr2[128] = (byte) (i73 & 255);
        bArr2[129] = (byte) ((i73 >>> 8) & 255);
        bArr2[130] = (byte) ((i73 >>> 16) & 255);
        bArr2[131] = (byte) (i73 >> 24);
        bArr2[132] = (byte) (i13 & 255);
        bArr2[133] = (byte) ((i13 >>> 8) & 255);
        bArr2[134] = (byte) ((i13 >>> 16) & 255);
        bArr2[135] = (byte) (i13 >> 24);
        int i74 = hfVar.J;
        bArr2[136] = (byte) (i74 & 255);
        bArr2[137] = (byte) ((i74 >>> 8) & 255);
        bArr2[138] = (byte) ((i74 >>> 16) & 255);
        bArr2[139] = (byte) (i74 >> 24);
        int i75 = hfVar.O0;
        bArr2[140] = (byte) (i75 & 255);
        bArr2[141] = (byte) ((i75 >>> 8) & 255);
        bArr2[142] = (byte) ((i75 >>> 16) & 255);
        bArr2[143] = (byte) (i75 >> 24);
        bArr2[144] = (byte) (i31 & 255);
        bArr2[145] = (byte) ((i31 >>> 8) & 255);
        bArr2[146] = (byte) ((i31 >>> 16) & 255);
        bArr2[147] = (byte) (i31 >> 24);
        int i76 = hfVar.f6802z2;
        bArr2[148] = (byte) (i76 & 255);
        bArr2[149] = (byte) ((i76 >>> 8) & 255);
        bArr2[150] = (byte) ((i76 >>> 16) & 255);
        bArr2[151] = (byte) (i76 >> 24);
        int i77 = hfVar.J0;
        bArr2[152] = (byte) (i77 & 255);
        bArr2[153] = (byte) ((i77 >>> 8) & 255);
        bArr2[154] = (byte) ((i77 >>> 16) & 255);
        bArr2[155] = (byte) (i77 >> 24);
        int i78 = hfVar.Q0;
        bArr2[156] = (byte) (i78 & 255);
        bArr2[157] = (byte) ((i78 >>> 8) & 255);
        bArr2[158] = (byte) ((i78 >>> 16) & 255);
        bArr2[159] = (byte) (i78 >> 24);
        bArr2[160] = (byte) (i12 & 255);
        bArr2[161] = (byte) ((i12 >>> 8) & 255);
        bArr2[162] = (byte) ((i12 >>> 16) & 255);
        bArr2[163] = (byte) (i12 >> 24);
        int i79 = hfVar.f6727g;
        bArr2[164] = (byte) (i79 & 255);
        bArr2[165] = (byte) ((i79 >>> 8) & 255);
        bArr2[166] = (byte) ((i79 >>> 16) & 255);
        bArr2[167] = (byte) (i79 >> 24);
        int i80 = hfVar.S1;
        bArr2[168] = (byte) (i80 & 255);
        bArr2[169] = (byte) ((i80 >>> 8) & 255);
        bArr2[170] = (byte) ((i80 >>> 16) & 255);
        bArr2[171] = (byte) (i80 >> 24);
        int i81 = hfVar.X0;
        bArr2[172] = (byte) (i81 & 255);
        bArr2[173] = (byte) ((i81 >>> 8) & 255);
        bArr2[174] = (byte) ((i81 >>> 16) & 255);
        bArr2[175] = (byte) (i81 >> 24);
        int i82 = hfVar.T;
        bArr2[176] = (byte) (i82 & 255);
        bArr2[177] = (byte) ((i82 >>> 8) & 255);
        bArr2[178] = (byte) ((i82 >>> 16) & 255);
        bArr2[179] = (byte) (i82 >> 24);
        int i83 = hfVar.f6789w1;
        bArr2[180] = (byte) (i83 & 255);
        bArr2[181] = (byte) ((i83 >>> 8) & 255);
        bArr2[182] = (byte) ((i83 >>> 16) & 255);
        bArr2[183] = (byte) (i83 >> 24);
        int i84 = hfVar.f6794x2;
        bArr2[184] = (byte) (i84 & 255);
        bArr2[185] = (byte) ((i84 >>> 8) & 255);
        bArr2[186] = (byte) ((i84 >>> 16) & 255);
        bArr2[187] = (byte) (i84 >> 24);
        int i85 = hfVar.K0;
        bArr2[188] = (byte) (i85 & 255);
        bArr2[189] = (byte) ((i85 >>> 8) & 255);
        bArr2[190] = (byte) ((i85 >>> 16) & 255);
        bArr2[191] = (byte) (i85 >> 24);
        int i86 = hfVar.S0;
        bArr2[192] = (byte) (i86 & 255);
        bArr2[193] = (byte) ((i86 >>> 8) & 255);
        bArr2[194] = (byte) ((i86 >>> 16) & 255);
        bArr2[195] = (byte) (i86 >> 24);
        bArr2[196] = (byte) (i19 & 255);
        bArr2[197] = (byte) ((i19 >>> 8) & 255);
        bArr2[198] = (byte) ((i19 >>> 16) & 255);
        bArr2[199] = (byte) (i19 >> 24);
        int i87 = hfVar.Z;
        bArr2[200] = (byte) (i87 & 255);
        bArr2[201] = (byte) ((i87 >>> 8) & 255);
        bArr2[202] = (byte) ((i87 >>> 16) & 255);
        bArr2[203] = (byte) (i87 >> 24);
        int i88 = hfVar.Y;
        bArr2[204] = (byte) (i88 & 255);
        bArr2[205] = (byte) ((i88 >>> 8) & 255);
        bArr2[206] = (byte) ((i88 >>> 16) & 255);
        bArr2[207] = (byte) (i88 >> 24);
        int i89 = hfVar.f6726f2;
        bArr2[208] = (byte) (i89 & 255);
        bArr2[209] = (byte) ((i89 >>> 8) & 255);
        bArr2[210] = (byte) ((i89 >>> 16) & 255);
        bArr2[211] = (byte) (i89 >> 24);
        int i90 = hfVar.f6706a0;
        bArr2[212] = (byte) (i90 & 255);
        bArr2[213] = (byte) ((i90 >>> 8) & 255);
        bArr2[214] = (byte) ((i90 >>> 16) & 255);
        bArr2[215] = (byte) (i90 >> 24);
        int i91 = hfVar.f6718d0;
        bArr2[216] = (byte) (i91 & 255);
        bArr2[217] = (byte) ((i91 >>> 8) & 255);
        bArr2[218] = (byte) ((i91 >>> 16) & 255);
        bArr2[219] = (byte) (i91 >> 24);
        int i92 = hfVar.f6712b2;
        bArr2[220] = (byte) (i92 & 255);
        bArr2[221] = (byte) ((i92 >>> 8) & 255);
        bArr2[222] = (byte) ((i92 >>> 16) & 255);
        bArr2[223] = (byte) (i92 >> 24);
        int i93 = hfVar.f6744k1;
        bArr2[224] = (byte) (i93 & 255);
        bArr2[225] = (byte) ((i93 >>> 8) & 255);
        bArr2[226] = (byte) ((i93 >>> 16) & 255);
        bArr2[227] = (byte) (i93 >> 24);
        int i94 = hfVar.f6736i1;
        bArr2[228] = (byte) (i94 & 255);
        bArr2[229] = (byte) ((i94 >>> 8) & 255);
        bArr2[230] = (byte) ((i94 >>> 16) & 255);
        bArr2[231] = (byte) (i94 >> 24);
        int i95 = hfVar.f6771r2;
        bArr2[232] = (byte) (i95 & 255);
        bArr2[233] = (byte) ((i95 >>> 8) & 255);
        bArr2[234] = (byte) ((i95 >>> 16) & 255);
        bArr2[235] = (byte) (i95 >> 24);
        int i96 = hfVar.A2;
        bArr2[236] = (byte) (i96 & 255);
        bArr2[237] = (byte) ((i96 >>> 8) & 255);
        bArr2[238] = (byte) ((i96 >>> 16) & 255);
        bArr2[239] = (byte) (i96 >> 24);
        int i97 = hfVar.f6719d1;
        bArr2[240] = (byte) (i97 & 255);
        bArr2[241] = (byte) ((i97 >>> 8) & 255);
        bArr2[242] = (byte) ((i97 >>> 16) & 255);
        bArr2[243] = (byte) (i97 >> 24);
        int i98 = hfVar.U;
        bArr2[244] = (byte) (i98 & 255);
        bArr2[245] = (byte) ((i98 >>> 8) & 255);
        bArr2[246] = (byte) ((i98 >>> 16) & 255);
        bArr2[247] = (byte) (i98 >> 24);
        int i99 = hfVar.f6800z0;
        bArr2[248] = (byte) (i99 & 255);
        bArr2[249] = (byte) ((i99 >>> 8) & 255);
        bArr2[250] = (byte) ((i99 >>> 16) & 255);
        bArr2[251] = (byte) (i99 >> 24);
        bArr2[252] = (byte) (i44 & 255);
        bArr2[253] = (byte) ((i44 >>> 8) & 255);
        bArr2[254] = (byte) ((i44 >>> 16) & 255);
        bArr2[255] = (byte) (i44 >> 24);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r9v55 ?? I:int), method size: 2827
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final void c(byte[] r93, byte[] r94) {
        /*
            Method dump skipped, instructions count: 2827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ff.c(byte[], byte[]):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r56v16 ?? I:??[int, boolean]), method size: 2844
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.cf
    public final void a(byte[] r108, byte[] r109) {
        /*
            Method dump skipped, instructions count: 2844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ff.a(byte[], byte[]):void");
    }
}
