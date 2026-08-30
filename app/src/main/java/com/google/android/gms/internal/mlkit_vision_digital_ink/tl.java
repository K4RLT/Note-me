package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;
import i0.a;
import r5.c;
import ra.e;

import android.net.Uri;
import android.system.Os;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.wd0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public abstract /* synthetic */ class tl {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f15010a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15011b = 0;

    public static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static ByteArrayInputStream c(String str) {
        pa.p(str.startsWith("data:"));
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            String[] split = str.substring(5, indexOf).split(";");
            boolean z3 = false;
            for (int i = 1; i < split.length; i++) {
                String str2 = split[i];
                if (str2.equals("base64")) {
                    z3 = true;
                } else if (!str2.startsWith("charset=")) {
                    Log.e("tl", "Unknown data-URI option '" + str2 + "' in " + str);
                    throw new mx(2);
                }
            }
            if (z3) {
                try {
                    byte[] decode = Base64.decode(substring, 0);
                    Log.i("tl", "Successfully decoded data uri: ".concat(str));
                    return new ByteArrayInputStream(decode);
                } catch (IllegalArgumentException unused) {
                    Log.e("tl", "Invalid base64 payload in data URI: ".concat(str));
                    throw new mx(4);
                }
            }
            Log.e("tl", "We only understand base64-encoded data URIs: ".concat(str));
            throw new mx(3);
        }
        Log.e("tl", "Comma not found in data URI: ".concat(str));
        throw new mx(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.h, com.google.android.gms.internal.mlkit_vision_digital_ink.h0] */
    public static IOException d(i iVar, Uri uri, IOException iOException, String str) {
        try {
            com.google.android.gms.internal.mlkit_vision_digital_ink.h0 obj = new Object();
            obj.f14388u = true;
            File file = (File) iVar.c(uri, obj);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return p(file, iOException, str);
                        }
                        return p(file, iOException, str);
                    }
                    if (file.canWrite()) {
                        return p(file, iOException, str);
                    }
                    return p(file, iOException, str);
                }
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return p(file, iOException, str);
                    }
                    return p(file, iOException, str);
                }
                if (file.canWrite()) {
                    return p(file, iOException, str);
                }
                return p(file, iOException, str);
            }
            return p(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static String e(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String h3;
        int i = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                h3 = "null";
            } else {
                try {
                    h3 = obj.toString();
                } catch (Exception e) {
                    String n10 = wd0.n(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(n10), (Throwable) e);
                    h3 = a5.a.h("<", n10, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i10] = h3;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i]);
            i++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i12 = i + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static ByteBuffer f(ArrayList arrayList) {
        String str;
        int size = arrayList.size();
        int i = 0;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            j10 += ((nn) ((km) obj)).e() + 12;
            i10++;
        }
        if (i10 != 0) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) j10);
                byte[] array = allocate.array();
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    nn nnVar = (nn) ((km) obj2);
                    int e = nnVar.e();
                    try {
                        allocate.putInt(e);
                        int i13 = i + 4;
                        try {
                            Logger logger = ym.f15284b;
                            nnVar.p(new wm(array, i13, e));
                        } catch (IOException e8) {
                            Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e8);
                        }
                        try {
                            allocate.put(array, i13, e);
                            int i14 = i13 + e;
                            CRC32 crc32 = new CRC32();
                            crc32.update(array, i14 - e, e);
                            allocate.putLong(crc32.getValue());
                            i = i14 + 8;
                        } catch (BufferOverflowException e10) {
                            Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", e10);
                            return null;
                        }
                    } catch (BufferOverflowException e11) {
                        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", e11);
                        return null;
                    }
                }
                allocate.rewind();
                return allocate;
            } catch (IllegalArgumentException e12) {
                if (j10 > 1073741824) {
                    str = String.format(Locale.US, "%.2fGB", Double.valueOf(j10 / 1.073741824E9d));
                } else if (j10 > 1048576) {
                    str = String.format(Locale.US, "%.2fMB", Double.valueOf(j10 / 1048576.0d));
                } else if (j10 > 1024) {
                    str = String.format(Locale.US, "%.2fKB", Double.valueOf(j10 / 1024.0d));
                } else {
                    Locale locale = Locale.US;
                    str = j10 + " Bytes";
                }
                Log.e("ProtoLiteUtil", "Too big to serialize, ".concat(str), e12);
                return null;
            }
        }
        return ByteBuffer.allocate(0);
    }

    public static /* synthetic */ boolean h(int i, z5 z5Var, StringBuilder sb2) {
        if (i - 1 != 0 || z5Var == z5.f15328a) {
            return false;
        }
        sb2.append(z5Var.b());
        sb2.append('.');
        sb2.append(z5Var.d());
        sb2.append(':');
        sb2.append(z5Var.a());
        return true;
    }

    public static int i(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return 0;
        }
        return 3;
    }

    public static int j(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return a(hashCode);
    }

    public static IOException l(File file, IOException iOException, String str) {
        String concat;
        try {
            Locale locale = Locale.US;
            concat = "Inoperable file:".concat(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]");
            try {
                concat = concat.concat(" mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]");
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m(com.google.android.gms.internal.mlkit_vision_digital_ink.i r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = ""
            com.google.android.gms.internal.mlkit_vision_digital_ink.i0 r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.i0.a()     // Catch: java.io.IOException -> L49
            java.lang.Object r5 = r5.c(r6, r1)     // Catch: java.io.IOException -> L49
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch: java.io.IOException -> L49
            java.lang.String r1 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L15 java.lang.Throwable -> L2e
            if (r1 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1a
            r1 = r0
            goto L38
        L1a:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            int r3 = r5.read(r2)     // Catch: java.lang.Throwable -> L2e
        L22:
            r4 = -1
            if (r3 == r4) goto L30
            r4 = 0
            r1.update(r2, r4, r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r5.read(r2)     // Catch: java.lang.Throwable -> L2e
            goto L22
        L2e:
            r1 = move-exception
            goto L3e
        L30:
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = t(r1)     // Catch: java.lang.Throwable -> L2e
        L38:
            if (r5 == 0) goto L3d
            r5.close()     // Catch: java.io.IOException -> L49
        L3d:
            return r1
        L3e:
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r5 = move-exception
            r1.addSuppressed(r5)     // Catch: java.io.IOException -> L49
        L48:
            throw r1     // Catch: java.io.IOException -> L49
        L49:
            java.lang.String r5 = "%s: Failed to open file, uri = %s"
            java.lang.String r1 = "FileValidator"
            com.google.android.gms.internal.mlkit_vision_digital_ink.cx.i(r5, r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.tl.m(com.google.android.gms.internal.mlkit_vision_digital_ink.i, android.net.Uri):java.lang.String");
    }

    public static boolean o(String str) {
        return str.startsWith("data:");
    }

    public static IOException p(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return l(file, iOException, str);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return l(file, iOException, str);
                    }
                    return l(file, iOException, str);
                }
                if (parentFile.canWrite()) {
                    return l(file, iOException, str);
                }
                return l(file, iOException, str);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return l(file, iOException, str);
                }
                return l(file, iOException, str);
            }
            if (parentFile.canWrite()) {
                return l(file, iOException, str);
            }
            return l(file, iOException, str);
        }
        return l(file, iOException, str);
    }

    public static void q(i iVar, or orVar, Uri uri, String str) {
        long j10;
        boolean z3 = false;
        int i = 21;
        try {
            if (iVar.g(uri)) {
                if (orVar.u() != 2) {
                    String m4 = m(iVar, uri);
                    if (!m4.equals(str)) {
                        try {
                            j10 = iVar.a(uri);
                        } catch (IOException unused) {
                            j10 = -1;
                        }
                        cx.g("%s: Downloaded file at uri = %s, expected checksum = %s, computed checksum = %s, size = %s verification failed", "FileValidator", uri, str, m4, Long.valueOf(j10));
                        int i10 = jr.f14529v;
                        ra.e eVar = new ra.e(i, z3);
                        eVar.f24675v = vq.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
                        int i11 = i5.f14460x;
                        String D = orVar.D();
                        if (D != null) {
                            if (str != null) {
                                eVar.f24677x = new i5(D, str, m4);
                                throw eVar.C();
                            }
                            throw new NullPointerException("Null expectedChecksum");
                        }
                        throw new NullPointerException("Null fileId");
                    }
                    return;
                }
                return;
            }
            cx.g("%s: Downloaded file %s is not present at %s", "FileValidator", f7.m(orVar), uri);
            int i12 = jr.f14529v;
            ra.e eVar2 = new ra.e(i, z3);
            eVar2.f24675v = vq.DOWNLOADED_FILE_NOT_FOUND_ERROR;
            throw eVar2.C();
        } catch (IOException e) {
            cx.j(e, "%s: Failed to validate download file %s", "FileValidator", f7.m(orVar));
            int i13 = jr.f14529v;
            ra.e eVar3 = new ra.e(i, z3);
            eVar3.f24675v = vq.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            eVar3.f24677x = e;
            throw eVar3.C();
        }
    }

    public static String t(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b10 : bArr) {
            char[] cArr2 = f15010a;
            cArr[i] = cArr2[(b10 & 255) >>> 4];
            cArr[i + 1] = cArr2[b10 & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public abstract k9 b(n9 n9Var);

    public abstract void g(dm dmVar, dm dmVar2);

    public abstract r9 k(n9 n9Var);

    public abstract void n(dm dmVar, Thread thread);

    public abstract void r(r9 r9Var, r9 r9Var2);

    public abstract boolean s(em emVar, am amVar, am amVar2);

    public abstract void u(r9 r9Var, Thread thread);

    public abstract boolean v(em emVar, Object obj, Object obj2);

    public abstract boolean w(n9 n9Var, k9 k9Var, k9 k9Var2);

    public abstract boolean x(em emVar, dm dmVar, dm dmVar2);

    public abstract boolean y(s9 s9Var, Object obj, Object obj2);

    public abstract boolean z(s9 s9Var, r9 r9Var, r9 r9Var2);
}
