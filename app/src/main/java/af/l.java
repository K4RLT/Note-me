package af;
import a.a;
import f.a;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import q.x;
import qb.r;
import qc.s1;

/* loaded from: classes.dex */
public abstract class l extends r {
    public static void b(File file, File file2) {
        file.getClass();
        if (file.exists()) {
            if (file2.exists() && !file2.delete()) {
                throw new c(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return;
                } else {
                    throw new c(file, file2, "Failed to create target directory.");
                }
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    na.a(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    pa.a(fileInputStream, th);
                    throw th2;
                }
            }
        } else {
            throw new c(file, null, "The source file doesn't exist.");
        }
    }

    public static boolean c(File file) {
        file.getClass();
        h hVar = new h(new j(file));
        while (true) {
            boolean z3 = true;
            while (hVar.hasNext()) {
                File file2 = (File) hVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z3) {
                        break;
                    }
                }
                z3 = false;
            }
            return z3;
        }
    }

    public static String d(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        int lastIndexOf = name.lastIndexOf(46, name.length() - 1);
        if (lastIndexOf == -1) {
            return "";
        }
        return name.substring(lastIndexOf + 1, name.length());
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, af.a] */
    public static byte[] e(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i10 = i;
                int i11 = 0;
                while (i10 > 0) {
                    int read = fileInputStream.read(bArr, i11, i10);
                    if (read < 0) {
                        break;
                    }
                    i10 -= read;
                    i11 += read;
                }
                if (i10 > 0) {
                    bArr = Arrays.copyOf(bArr, i11);
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8193);
                        byteArrayOutputStream.write(read2);
                        na.a(fileInputStream, byteArrayOutputStream);
                        int size = byteArrayOutputStream.size() + i;
                        if (size >= 0) {
                            byte[] f10 = byteArrayOutputStream.f();
                            bArr = Arrays.copyOf(bArr, size);
                            System.arraycopy(f10, 0, bArr, i, byteArrayOutputStream.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                fileInputStream.close();
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pa.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String f(File file) {
        Charset charset = mf.a.f20798a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String a10 = s1.a(inputStreamReader);
            inputStreamReader.close();
            return a10;
        } finally {
        }
    }

    public static File g(File file, String str) {
        int i;
        boolean z3;
        int r8;
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        char c10 = File.separatorChar;
        boolean z9 = false;
        int r10 = mf.f.r(path, c10, 0, 4);
        if (r10 == 0) {
            if (path.length() > 1 && path.charAt(1) == c10 && (r8 = mf.f.r(path, c10, 2, 4)) >= 0) {
                int r11 = mf.f.r(path, c10, r8 + 1, 4);
                if (r11 >= 0) {
                    i = r11 + 1;
                } else {
                    i = path.length();
                }
            } else {
                i = 1;
            }
        } else if (r10 > 0 && path.charAt(r10 - 1) == ':') {
            i = r10 + 1;
        } else if (r10 == -1 && mf.f.o(path, ':')) {
            i = path.length();
        } else {
            i = 0;
        }
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() == 0) {
            z9 = true;
        }
        if (!z9 && !mf.f.o(file3, c10)) {
            return new File(file3 + c10 + file2);
        }
        return new File(file3 + file2);
    }

    public static void h(File file, String str) {
        Charset charset = mf.a.f20798a;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void i(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z3;
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i = 0;
        int i10 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i10, str.length() - i);
            int i11 = i + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i, i11, array, i10);
            allocate.limit(min + i10);
            i10 = 1;
            if (i11 == str.length()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z3).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i10 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i = i11;
            } else {
                x.o("Check failed.");
                return;
            }
        }
    }
}