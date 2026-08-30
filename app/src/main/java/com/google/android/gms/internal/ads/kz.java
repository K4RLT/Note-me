package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class kz extends jz {

    /* renamed from: x, reason: collision with root package name */
    public File f7906x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7907y;

    /* renamed from: z, reason: collision with root package name */
    public static final Set f7905z = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat A = new DecimalFormat("#,###");

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0364, code lost:
    
        r2 = r36;
        r8 = r3;
        r32 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x036b, code lost:
    
        r0 = java.lang.Long.toString(r27);
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r5.append("Timeout exceeded. Limit: ");
        r5.append(r0);
        r5.append(r11);
        r15 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0394, code lost:
    
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0395, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0398, code lost:
    
        r11 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x039f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a2, code lost:
    
        r11 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0354, code lost:
    
        r3 = r8;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03ad, code lost:
    
        r2 = r36;
        r8 = r3;
        r6 = r4;
        r32 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03b4, code lost:
    
        r11 = "sizeExceeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03b6, code lost:
    
        r0 = java.lang.Integer.toString(r0);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 40);
        r4.append(r6);
        r4.append(r0);
        r15 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03da, code lost:
    
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03db, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8 A[LOOP:0: B:3:0x0022->B:12:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04f6  */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.android.gms.internal.ads.jw0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    @Override // com.google.android.gms.internal.ads.jz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kz.b(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void l() {
        this.f7907y = true;
    }

    public final File o(File file) {
        return new File(new File(this.f7906x, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
