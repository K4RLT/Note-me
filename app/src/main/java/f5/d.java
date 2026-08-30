package f5;
import d.h;

import android.content.pm.PackageInfo;
import eb.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import q.x;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final w f16737a = new w(20);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f16738b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f16739c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f16740d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f16741f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f16742g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f16743h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f16744j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (b bVar : bVarArr) {
            i11 += ((((bVar.f16735g * 2) + 7) & (-8)) / 8) + (bVar.e * 2) + d(bArr, bVar.f16730a, bVar.f16731b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f16734f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, f16741f)) {
            int length = bVarArr.length;
            while (i10 < length) {
                b bVar2 = bVarArr[i10];
                q(byteArrayOutputStream, bVar2, d(bArr, bVar2.f16730a, bVar2.f16731b));
                p(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                q(byteArrayOutputStream, bVar3, d(bArr, bVar3.f16730a, bVar3.f16731b));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                p(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z3 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            return z3;
        }
        file.delete();
        return true;
    }

    public static String d(byte[] bArr, String str, String str2) {
        Object obj;
        byte[] bArr2 = f16743h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f16742g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                        str3 = ":";
                    }
                    return a5.a.k(sb2, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                x.o(g3.a.g(i10, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += (int) m(byteArrayInputStream, 2);
            iArr[i12] = i11;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f16740d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m4 = (int) m(fileInputStream, 1);
                    byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                        try {
                            b[] j10 = j(byteArrayInputStream, m4, bVarArr);
                            byteArrayInputStream.close();
                            return j10;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    x.o("Content found after the end of file");
                    return null;
                }
                x.o("Unsupported meta version");
                return null;
            }
            x.o("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (Arrays.equals(bArr, f16744j)) {
            int m10 = (int) m(fileInputStream, 2);
            byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h10);
                try {
                    b[] k3 = k(byteArrayInputStream2, bArr2, m10, bVarArr);
                    byteArrayInputStream2.close();
                    return k3;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            x.o("Content found after the end of file");
            return null;
        }
        x.o("Unsupported meta version");
        return null;
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int m4 = (int) m(byteArrayInputStream, 2);
                iArr[i11] = (int) m(byteArrayInputStream, 2);
                strArr[i11] = new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                b bVar = bVarArr[i12];
                if (bVar.f16731b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    bVar.e = i13;
                    bVar.f16736h = g(byteArrayInputStream, i13);
                } else {
                    x.o("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return bVarArr;
        }
        x.o("Mismatched number of dex files found in metadata");
        return null;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, b[] bVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m4 = m(byteArrayInputStream, 4);
                int m10 = (int) m(byteArrayInputStream, 2);
                b bVar = null;
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 >= bVarArr.length) {
                            break;
                        }
                        if (bVarArr[i12].f16731b.equals(str)) {
                            bVar = bVarArr[i12];
                            break;
                        }
                        i12++;
                    }
                }
                if (bVar != null) {
                    bVar.f16733d = m4;
                    int[] g8 = g(byteArrayInputStream, m10);
                    if (Arrays.equals(bArr, f16743h)) {
                        bVar.e = m10;
                        bVar.f16736h = g8;
                    }
                } else {
                    x.o("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return bVarArr;
        }
        x.o("Mismatched number of dex files found in metadata");
        return null;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, e)) {
            int m4 = (int) m(fileInputStream, 1);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                try {
                    b[] n10 = n(byteArrayInputStream, str, m4);
                    byteArrayInputStream.close();
                    return n10;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            x.o("Content found after the end of file");
            return null;
        }
        x.o("Unsupported version");
        return null;
    }

    public static long m(InputStream inputStream, int i10) {
        byte[] f10 = f(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += (f10[i11] & 255) << (i11 * 8);
        }
        return j10;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        int i11;
        int i12 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m10 = (int) m(byteArrayInputStream, 2);
            bVarArr[i13] = new b(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m10, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m10], new TreeMap());
        }
        int i14 = 0;
        while (i14 < i10) {
            b bVar = bVarArr[i14];
            int available = byteArrayInputStream.available();
            int i15 = bVar.f16734f;
            int i16 = bVar.f16735g;
            TreeMap treeMap = bVar.i;
            int i17 = available - i15;
            int i18 = i12;
            while (byteArrayInputStream.available() > i17) {
                i18 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i18), 1);
                int m11 = (int) m(byteArrayInputStream, 2);
                while (m11 > 0) {
                    m(byteArrayInputStream, 2);
                    int m12 = (int) m(byteArrayInputStream, 1);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(byteArrayInputStream, 1);
                            int i19 = i12;
                            int i20 = i14;
                            for (int m13 = (int) m(byteArrayInputStream, 1); m13 > 0; m13--) {
                                m(byteArrayInputStream, 2);
                            }
                            m12--;
                            i12 = i19;
                            i14 = i20;
                        }
                    }
                    m11--;
                    i12 = i12;
                    i14 = i14;
                }
            }
            int i21 = i12;
            int i22 = i14;
            if (byteArrayInputStream.available() == i17) {
                bVar.f16736h = g(byteArrayInputStream, bVar.e);
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i16 * 2) + 7) & (-8)) / 8));
                for (int i23 = i21; i23 < i16; i23++) {
                    if (valueOf.get(i23)) {
                        i11 = 2;
                    } else {
                        i11 = i21;
                    }
                    if (valueOf.get(i23 + i16)) {
                        i11 |= 4;
                    }
                    if (i11 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i23));
                        if (num == null) {
                            num = Integer.valueOf(i21);
                        }
                        treeMap.put(Integer.valueOf(i23), Integer.valueOf(i11 | num.intValue()));
                    }
                }
                i14 = i22 + 1;
                i12 = i21;
            } else {
                x.o("Read too much data during profile line parse");
                return null;
            }
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f16740d;
        int i10 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                v(byteArrayOutputStream2, bVarArr.length);
                int i11 = 2;
                int i12 = 2;
                for (b bVar : bVarArr) {
                    u(byteArrayOutputStream2, bVar.f16732c, 4);
                    u(byteArrayOutputStream2, bVar.f16733d, 4);
                    u(byteArrayOutputStream2, bVar.f16735g, 4);
                    String d2 = d(bArr2, bVar.f16730a, bVar.f16731b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d2.getBytes(charset).length;
                    v(byteArrayOutputStream2, length2);
                    i12 = i12 + 14 + length2;
                    byteArrayOutputStream2.write(d2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i12 == byteArray.length) {
                    i iVar = new i(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(iVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < bVarArr.length) {
                        try {
                            b bVar2 = bVarArr[i13];
                            v(byteArrayOutputStream3, i13);
                            v(byteArrayOutputStream3, bVar2.e);
                            i14 = i14 + 4 + (bVar2.e * i11);
                            int[] iArr = bVar2.f16736h;
                            int length3 = iArr.length;
                            int i15 = i10;
                            int i16 = i11;
                            int i17 = i15;
                            while (i17 < length3) {
                                int i18 = iArr[i17];
                                v(byteArrayOutputStream3, i18 - i15);
                                i17++;
                                i15 = i18;
                            }
                            i13++;
                            i11 = i16;
                            i10 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i14 == byteArray2.length) {
                        i iVar2 = new i(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(iVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < bVarArr.length) {
                            try {
                                b bVar3 = bVarArr[i19];
                                Iterator it = bVar3.i.entrySet().iterator();
                                int i21 = 0;
                                while (it.hasNext()) {
                                    i21 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    r(byteArrayOutputStream4, i21, bVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        s(byteArrayOutputStream4, bVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        v(byteArrayOutputStream3, i19);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i22 = i20 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        u(byteArrayOutputStream3, length4, 4);
                                        v(byteArrayOutputStream3, i21);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i20 = i22 + length4;
                                        i19++;
                                        arrayList3 = arrayList4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i20 == byteArray5.length) {
                            i iVar3 = new i(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList2.add(iVar3);
                            long j11 = 4;
                            long size = j11 + j11 + 4 + (arrayList2.size() * 16);
                            u(byteArrayOutputStream, arrayList2.size(), 4);
                            int i23 = 0;
                            while (i23 < arrayList2.size()) {
                                i iVar4 = (i) arrayList2.get(i23);
                                int i24 = iVar4.f16754a;
                                byte[] bArr3 = iVar4.f16755b;
                                if (i24 != 1) {
                                    if (i24 != 2) {
                                        if (i24 != 3) {
                                            if (i24 != 4) {
                                                if (i24 == 5) {
                                                    j10 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j10 = 3;
                                            }
                                        } else {
                                            j10 = 2;
                                        }
                                    } else {
                                        j10 = 1;
                                    }
                                } else {
                                    j10 = 0;
                                }
                                u(byteArrayOutputStream, j10, 4);
                                u(byteArrayOutputStream, size, 4);
                                if (iVar4.f16756c) {
                                    long length5 = bArr3.length;
                                    byte[] a10 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a10);
                                    u(byteArrayOutputStream, a10.length, 4);
                                    u(byteArrayOutputStream, length5, 4);
                                    length = a10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    u(byteArrayOutputStream, bArr3.length, 4);
                                    u(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i23++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i25));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i20 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b10 = b(bVarArr, bArr4);
            u(byteArrayOutputStream, bVarArr.length, 1);
            u(byteArrayOutputStream, b10.length, 4);
            byte[] a11 = a(b10);
            u(byteArrayOutputStream, a11.length, 4);
            byteArrayOutputStream.write(a11);
            return true;
        }
        byte[] bArr5 = f16742g;
        if (Arrays.equals(bArr, bArr5)) {
            u(byteArrayOutputStream, bVarArr.length, 1);
            for (b bVar4 : bVarArr) {
                int size2 = bVar4.i.size() * 4;
                String d10 = d(bArr5, bVar4.f16730a, bVar4.f16731b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d10.getBytes(charset2).length);
                v(byteArrayOutputStream, bVar4.f16736h.length);
                u(byteArrayOutputStream, size2, 4);
                u(byteArrayOutputStream, bVar4.f16732c, 4);
                byteArrayOutputStream.write(d10.getBytes(charset2));
                Iterator it2 = bVar4.i.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    v(byteArrayOutputStream, 0);
                }
                for (int i26 : bVar4.f16736h) {
                    v(byteArrayOutputStream, i26);
                }
            }
            return true;
        }
        byte[] bArr6 = f16741f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b11 = b(bVarArr, bArr6);
            u(byteArrayOutputStream, bVarArr.length, 1);
            u(byteArrayOutputStream, b11.length, 4);
            byte[] a12 = a(b11);
            u(byteArrayOutputStream, a12.length, 4);
            byteArrayOutputStream.write(a12);
            return true;
        }
        byte[] bArr7 = f16743h;
        if (Arrays.equals(bArr, bArr7)) {
            v(byteArrayOutputStream, bVarArr.length);
            for (b bVar5 : bVarArr) {
                String str = bVar5.f16730a;
                TreeMap treeMap = bVar5.i;
                String d11 = d(bArr7, str, bVar5.f16731b);
                Charset charset3 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d11.getBytes(charset3).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, bVar5.f16736h.length);
                u(byteArrayOutputStream, bVar5.f16732c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i27 : bVar5.f16736h) {
                    v(byteArrayOutputStream, i27);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        s(byteArrayOutputStream, bVar);
        int i10 = bVar.f16735g;
        int[] iArr = bVar.f16736h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            v(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i14 = intValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i15 = intValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, bVar.e);
        u(byteArrayOutputStream, bVar.f16734f, 4);
        u(byteArrayOutputStream, bVar.f16732c, 4);
        u(byteArrayOutputStream, bVar.f16735g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i10, b bVar) {
        int i11 = bVar.f16735g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & intValue2) == i13) {
                        int i14 = (i12 * i11) + intValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i10 = 0;
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i10);
                v(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, f5.c r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.d.t(android.content.Context, java.util.concurrent.Executor, f5.c, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        u(byteArrayOutputStream, i10, 2);
    }
}
