// created by JCOMGen
// from TypeLib at F:\github\jdm\lib\3.1233\dm.dll
// check for latest version at http://www.simtel.net

package com.yzj.jdm.Dm;

import com.develop.jawin.*;
import com.develop.jawin.constants.*;
import com.develop.jawin.marshal.*;
import com.develop.io.*;
import java.io.*;

public class Idmsoft extends DispatchPtr {
    static public final GUID proxyIID = new GUID("{F3F54BC2-D6D1-4A85-B943-16287ECEA64C}");


    static public final int iidToken;

    static {
        iidToken = IdentityManager.registerProxy(proxyIID, Idmsoft.class);
    }

    public int getGuidToken() {
        return iidToken;
    }

    public Idmsoft() throws COMException {
        super();
    }
    public Idmsoft(String progid) throws COMException {
        super(progid);
    }
    public Idmsoft(IUnknown other) throws COMException {
        super(other);
    }
    public Idmsoft(GUID ClsID) throws COMException {
        super(ClsID);
    }
    public java.lang.String Ver() throws COMException {
        return (java.lang.String) invoke("Ver");
    }
    public int SetPath(java.lang.String path) throws COMException {
        return ((java.lang.Integer) invokeN("SetPath", new Object[]{path}, 1)).intValue();
    }
    public java.lang.String Ocr(int x1, int y1, int x2, int y2, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("Ocr", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Double(sim)}, 6);
    }
    public int FindStr(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("FindStr", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim), x, y}, 9)).intValue();
    }
    public int GetResultCount(java.lang.String str) throws COMException {
        return ((java.lang.Integer) invokeN("GetResultCount", new Object[]{str}, 1)).intValue();
    }
    public int GetResultPos(java.lang.String str, int index, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("GetResultPos", new Object[]{str, new java.lang.Integer(index), x, y}, 4)).intValue();
    }
    public int StrStr(java.lang.String s, java.lang.String str) throws COMException {
        return ((java.lang.Integer) invokeN("StrStr", new Object[]{s, str}, 2)).intValue();
    }
    public int SendCommand(java.lang.String cmd) throws COMException {
        return ((java.lang.Integer) invokeN("SendCommand", new Object[]{cmd}, 1)).intValue();
    }
    public int UseDict(int index) throws COMException {
        return ((java.lang.Integer) invokeN("UseDict", new Object[]{new java.lang.Integer(index)}, 1)).intValue();
    }
    public java.lang.String GetBasePath() throws COMException {
        return (java.lang.String) invoke("GetBasePath");
    }
    public int SetDictPwd(java.lang.String pwd) throws COMException {
        return ((java.lang.Integer) invokeN("SetDictPwd", new Object[]{pwd}, 1)).intValue();
    }
    public java.lang.String OcrInFile(int x1, int y1, int x2, int y2, java.lang.String pic_name, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("OcrInFile", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_name, color, new java.lang.Double(sim)}, 7);
    }
    public int Capture(int x1, int y1, int x2, int y2, java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("Capture", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), file}, 5)).intValue();
    }
    public int KeyPress(int vk) throws COMException {
        return ((java.lang.Integer) invokeN("KeyPress", new Object[]{new java.lang.Integer(vk)}, 1)).intValue();
    }
    public int KeyDown(int vk) throws COMException {
        return ((java.lang.Integer) invokeN("KeyDown", new Object[]{new java.lang.Integer(vk)}, 1)).intValue();
    }
    public int KeyUp(int vk) throws COMException {
        return ((java.lang.Integer) invokeN("KeyUp", new Object[]{new java.lang.Integer(vk)}, 1)).intValue();
    }
    public int LeftClick() throws COMException {
        return ((java.lang.Integer) invoke("LeftClick")).intValue();
    }
    public int RightClick() throws COMException {
        return ((java.lang.Integer) invoke("RightClick")).intValue();
    }
    public int MiddleClick() throws COMException {
        return ((java.lang.Integer) invoke("MiddleClick")).intValue();
    }
    public int LeftDoubleClick() throws COMException {
        return ((java.lang.Integer) invoke("LeftDoubleClick")).intValue();
    }
    public int LeftDown() throws COMException {
        return ((java.lang.Integer) invoke("LeftDown")).intValue();
    }
    public int LeftUp() throws COMException {
        return ((java.lang.Integer) invoke("LeftUp")).intValue();
    }
    public int RightDown() throws COMException {
        return ((java.lang.Integer) invoke("RightDown")).intValue();
    }
    public int RightUp() throws COMException {
        return ((java.lang.Integer) invoke("RightUp")).intValue();
    }
    public int MoveTo(int x, int y) throws COMException {
        return ((java.lang.Integer) invokeN("MoveTo", new Object[]{new java.lang.Integer(x), new java.lang.Integer(y)}, 2)).intValue();
    }
    public int MoveR(int rx, int ry) throws COMException {
        return ((java.lang.Integer) invokeN("MoveR", new Object[]{new java.lang.Integer(rx), new java.lang.Integer(ry)}, 2)).intValue();
    }
    public java.lang.String GetColor(int x, int y) throws COMException {
        return (java.lang.String) invokeN("GetColor", new Object[]{new java.lang.Integer(x), new java.lang.Integer(y)}, 2);
    }
    public java.lang.String GetColorBGR(int x, int y) throws COMException {
        return (java.lang.String) invokeN("GetColorBGR", new Object[]{new java.lang.Integer(x), new java.lang.Integer(y)}, 2);
    }
    public java.lang.String RGB2BGR(java.lang.String rgb_color) throws COMException {
        return (java.lang.String) invokeN("RGB2BGR", new Object[]{rgb_color}, 1);
    }
    public java.lang.String BGR2RGB(java.lang.String bgr_color) throws COMException {
        return (java.lang.String) invokeN("BGR2RGB", new Object[]{bgr_color}, 1);
    }
    public int UnBindWindow() throws COMException {
        return ((java.lang.Integer) invoke("UnBindWindow")).intValue();
    }
    public int CmpColor(int x, int y, java.lang.String color, double sim) throws COMException {
        return ((java.lang.Integer) invokeN("CmpColor", new Object[]{new java.lang.Integer(x), new java.lang.Integer(y), color, new java.lang.Double(sim)}, 4)).intValue();
    }
    public int ClientToScreen(int hwnd, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("ClientToScreen", new Object[]{new java.lang.Integer(hwnd), x, y}, 3)).intValue();
    }
    public int ScreenToClient(int hwnd, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("ScreenToClient", new Object[]{new java.lang.Integer(hwnd), x, y}, 3)).intValue();
    }
    public int ShowScrMsg(int x1, int y1, int x2, int y2, java.lang.String msg, java.lang.String color) throws COMException {
        return ((java.lang.Integer) invokeN("ShowScrMsg", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), msg, color}, 6)).intValue();
    }
    public int SetMinRowGap(int row_gap) throws COMException {
        return ((java.lang.Integer) invokeN("SetMinRowGap", new Object[]{new java.lang.Integer(row_gap)}, 1)).intValue();
    }
    public int SetMinColGap(int col_gap) throws COMException {
        return ((java.lang.Integer) invokeN("SetMinColGap", new Object[]{new java.lang.Integer(col_gap)}, 1)).intValue();
    }
    public int FindColor(int x1, int y1, int x2, int y2, java.lang.String color, double sim, int dir, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("FindColor", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Double(sim), new java.lang.Integer(dir), x, y}, 9)).intValue();
    }
    public java.lang.String FindColorEx(int x1, int y1, int x2, int y2, java.lang.String color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindColorEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 7);
    }
    public int SetWordLineHeight(int line_height) throws COMException {
        return ((java.lang.Integer) invokeN("SetWordLineHeight", new Object[]{new java.lang.Integer(line_height)}, 1)).intValue();
    }
    public int SetWordGap(int word_gap) throws COMException {
        return ((java.lang.Integer) invokeN("SetWordGap", new Object[]{new java.lang.Integer(word_gap)}, 1)).intValue();
    }
    public int SetRowGapNoDict(int row_gap) throws COMException {
        return ((java.lang.Integer) invokeN("SetRowGapNoDict", new Object[]{new java.lang.Integer(row_gap)}, 1)).intValue();
    }
    public int SetColGapNoDict(int col_gap) throws COMException {
        return ((java.lang.Integer) invokeN("SetColGapNoDict", new Object[]{new java.lang.Integer(col_gap)}, 1)).intValue();
    }
    public int SetWordLineHeightNoDict(int line_height) throws COMException {
        return ((java.lang.Integer) invokeN("SetWordLineHeightNoDict", new Object[]{new java.lang.Integer(line_height)}, 1)).intValue();
    }
    public int SetWordGapNoDict(int word_gap) throws COMException {
        return ((java.lang.Integer) invokeN("SetWordGapNoDict", new Object[]{new java.lang.Integer(word_gap)}, 1)).intValue();
    }
    public int GetWordResultCount(java.lang.String str) throws COMException {
        return ((java.lang.Integer) invokeN("GetWordResultCount", new Object[]{str}, 1)).intValue();
    }
    public int GetWordResultPos(java.lang.String str, int index, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("GetWordResultPos", new Object[]{str, new java.lang.Integer(index), x, y}, 4)).intValue();
    }
    public java.lang.String GetWordResultStr(java.lang.String str, int index) throws COMException {
        return (java.lang.String) invokeN("GetWordResultStr", new Object[]{str, new java.lang.Integer(index)}, 2);
    }
    public java.lang.String GetWords(int x1, int y1, int x2, int y2, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("GetWords", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Double(sim)}, 6);
    }
    public java.lang.String GetWordsNoDict(int x1, int y1, int x2, int y2, java.lang.String color) throws COMException {
        return (java.lang.String) invokeN("GetWordsNoDict", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color}, 5);
    }
    public int SetShowErrorMsg(int show) throws COMException {
        return ((java.lang.Integer) invokeN("SetShowErrorMsg", new Object[]{new java.lang.Integer(show)}, 1)).intValue();
    }
    public int GetClientSize(int hwnd, java.lang.Object width, java.lang.Object height) throws COMException {
        return ((java.lang.Integer) invokeN("GetClientSize", new Object[]{new java.lang.Integer(hwnd), width, height}, 3)).intValue();
    }
    public int MoveWindow(int hwnd, int x, int y) throws COMException {
        return ((java.lang.Integer) invokeN("MoveWindow", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x), new java.lang.Integer(y)}, 3)).intValue();
    }
    public java.lang.String GetColorHSV(int x, int y) throws COMException {
        return (java.lang.String) invokeN("GetColorHSV", new Object[]{new java.lang.Integer(x), new java.lang.Integer(y)}, 2);
    }
    public java.lang.String GetAveRGB(int x1, int y1, int x2, int y2) throws COMException {
        return (java.lang.String) invokeN("GetAveRGB", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2)}, 4);
    }
    public java.lang.String GetAveHSV(int x1, int y1, int x2, int y2) throws COMException {
        return (java.lang.String) invokeN("GetAveHSV", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2)}, 4);
    }
    public int GetForegroundWindow() throws COMException {
        return ((java.lang.Integer) invoke("GetForegroundWindow")).intValue();
    }
    public int GetForegroundFocus() throws COMException {
        return ((java.lang.Integer) invoke("GetForegroundFocus")).intValue();
    }
    public int GetMousePointWindow() throws COMException {
        return ((java.lang.Integer) invoke("GetMousePointWindow")).intValue();
    }
    public int GetPointWindow(int x, int y) throws COMException {
        return ((java.lang.Integer) invokeN("GetPointWindow", new Object[]{new java.lang.Integer(x), new java.lang.Integer(y)}, 2)).intValue();
    }
    public java.lang.String EnumWindow(int parent, java.lang.String title, java.lang.String class_name, int filter) throws COMException {
        return (java.lang.String) invokeN("EnumWindow", new Object[]{new java.lang.Integer(parent), title, class_name, new java.lang.Integer(filter)}, 4);
    }
    public int GetWindowState(int hwnd, int flag) throws COMException {
        return ((java.lang.Integer) invokeN("GetWindowState", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(flag)}, 2)).intValue();
    }
    public int GetWindow(int hwnd, int flag) throws COMException {
        return ((java.lang.Integer) invokeN("GetWindow", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(flag)}, 2)).intValue();
    }
    public int GetSpecialWindow(int flag) throws COMException {
        return ((java.lang.Integer) invokeN("GetSpecialWindow", new Object[]{new java.lang.Integer(flag)}, 1)).intValue();
    }
    public int SetWindowText(int hwnd, java.lang.String text) throws COMException {
        return ((java.lang.Integer) invokeN("SetWindowText", new Object[]{new java.lang.Integer(hwnd), text}, 2)).intValue();
    }
    public int SetWindowSize(int hwnd, int width, int height) throws COMException {
        return ((java.lang.Integer) invokeN("SetWindowSize", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(width), new java.lang.Integer(height)}, 3)).intValue();
    }
    public int GetWindowRect(int hwnd, java.lang.Object x1, java.lang.Object y1, java.lang.Object x2, java.lang.Object y2) throws COMException {
        return ((java.lang.Integer) invokeN("GetWindowRect", new Object[]{new java.lang.Integer(hwnd), x1, y1, x2, y2}, 5)).intValue();
    }
    public java.lang.String GetWindowTitle(int hwnd) throws COMException {
        return (java.lang.String) invokeN("GetWindowTitle", new Object[]{new java.lang.Integer(hwnd)}, 1);
    }
    public java.lang.String GetWindowClass(int hwnd) throws COMException {
        return (java.lang.String) invokeN("GetWindowClass", new Object[]{new java.lang.Integer(hwnd)}, 1);
    }
    public int SetWindowState(int hwnd, int flag) throws COMException {
        return ((java.lang.Integer) invokeN("SetWindowState", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(flag)}, 2)).intValue();
    }
    public int CreateFoobarRect(int hwnd, int x, int y, int w, int h) throws COMException {
        return ((java.lang.Integer) invokeN("CreateFoobarRect", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x), new java.lang.Integer(y), new java.lang.Integer(w), new java.lang.Integer(h)}, 5)).intValue();
    }
    public int CreateFoobarRoundRect(int hwnd, int x, int y, int w, int h, int rw, int rh) throws COMException {
        return ((java.lang.Integer) invokeN("CreateFoobarRoundRect", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x), new java.lang.Integer(y), new java.lang.Integer(w), new java.lang.Integer(h), new java.lang.Integer(rw), new java.lang.Integer(rh)}, 7)).intValue();
    }
    public int CreateFoobarEllipse(int hwnd, int x, int y, int w, int h) throws COMException {
        return ((java.lang.Integer) invokeN("CreateFoobarEllipse", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x), new java.lang.Integer(y), new java.lang.Integer(w), new java.lang.Integer(h)}, 5)).intValue();
    }
    public int CreateFoobarCustom(int hwnd, int x, int y, java.lang.String pic, java.lang.String trans_color, double sim) throws COMException {
        return ((java.lang.Integer) invokeN("CreateFoobarCustom", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x), new java.lang.Integer(y), pic, trans_color, new java.lang.Double(sim)}, 6)).intValue();
    }
    public int FoobarFillRect(int hwnd, int x1, int y1, int x2, int y2, java.lang.String color) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarFillRect", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color}, 6)).intValue();
    }
    public int FoobarDrawText(int hwnd, int x, int y, int w, int h, java.lang.String text, java.lang.String color, int align) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarDrawText", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x), new java.lang.Integer(y), new java.lang.Integer(w), new java.lang.Integer(h), text, color, new java.lang.Integer(align)}, 8)).intValue();
    }
    public int FoobarDrawPic(int hwnd, int x, int y, java.lang.String pic, java.lang.String trans_color) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarDrawPic", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x), new java.lang.Integer(y), pic, trans_color}, 5)).intValue();
    }
    public int FoobarUpdate(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarUpdate", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public int FoobarLock(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarLock", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public int FoobarUnlock(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarUnlock", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public int FoobarSetFont(int hwnd, java.lang.String font_name, int size, int flag) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarSetFont", new Object[]{new java.lang.Integer(hwnd), font_name, new java.lang.Integer(size), new java.lang.Integer(flag)}, 4)).intValue();
    }
    public int FoobarTextRect(int hwnd, int x, int y, int w, int h) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarTextRect", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x), new java.lang.Integer(y), new java.lang.Integer(w), new java.lang.Integer(h)}, 5)).intValue();
    }
    public int FoobarPrintText(int hwnd, java.lang.String text, java.lang.String color) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarPrintText", new Object[]{new java.lang.Integer(hwnd), text, color}, 3)).intValue();
    }
    public int FoobarClearText(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarClearText", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public int FoobarTextLineGap(int hwnd, int gap) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarTextLineGap", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(gap)}, 2)).intValue();
    }
    public int Play(java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("Play", new Object[]{file}, 1)).intValue();
    }
    public int FaqCapture(int x1, int y1, int x2, int y2, int quality, int delay, int time) throws COMException {
        return ((java.lang.Integer) invokeN("FaqCapture", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), new java.lang.Integer(quality), new java.lang.Integer(delay), new java.lang.Integer(time)}, 7)).intValue();
    }
    public int FaqRelease(int handle) throws COMException {
        return ((java.lang.Integer) invokeN("FaqRelease", new Object[]{new java.lang.Integer(handle)}, 1)).intValue();
    }
    public java.lang.String FaqSend(java.lang.String server, int handle, int request_type, int time_out) throws COMException {
        return (java.lang.String) invokeN("FaqSend", new Object[]{server, new java.lang.Integer(handle), new java.lang.Integer(request_type), new java.lang.Integer(time_out)}, 4);
    }
    public int Beep(int fre, int delay) throws COMException {
        return ((java.lang.Integer) invokeN("Beep", new Object[]{new java.lang.Integer(fre), new java.lang.Integer(delay)}, 2)).intValue();
    }
    public int FoobarClose(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarClose", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public int MoveDD(int dx, int dy) throws COMException {
        return ((java.lang.Integer) invokeN("MoveDD", new Object[]{new java.lang.Integer(dx), new java.lang.Integer(dy)}, 2)).intValue();
    }
    public int FaqGetSize(int handle) throws COMException {
        return ((java.lang.Integer) invokeN("FaqGetSize", new Object[]{new java.lang.Integer(handle)}, 1)).intValue();
    }
    public int LoadPic(java.lang.String pic_name) throws COMException {
        return ((java.lang.Integer) invokeN("LoadPic", new Object[]{pic_name}, 1)).intValue();
    }
    public int FreePic(java.lang.String pic_name) throws COMException {
        return ((java.lang.Integer) invokeN("FreePic", new Object[]{pic_name}, 1)).intValue();
    }
    public int GetScreenData(int x1, int y1, int x2, int y2) throws COMException {
        return ((java.lang.Integer) invokeN("GetScreenData", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2)}, 4)).intValue();
    }
    public int FreeScreenData(int handle) throws COMException {
        return ((java.lang.Integer) invokeN("FreeScreenData", new Object[]{new java.lang.Integer(handle)}, 1)).intValue();
    }
    public int WheelUp() throws COMException {
        return ((java.lang.Integer) invoke("WheelUp")).intValue();
    }
    public int WheelDown() throws COMException {
        return ((java.lang.Integer) invoke("WheelDown")).intValue();
    }
    public int SetMouseDelay(java.lang.String type, int delay) throws COMException {
        return ((java.lang.Integer) invokeN("SetMouseDelay", new Object[]{type, new java.lang.Integer(delay)}, 2)).intValue();
    }
    public int SetKeypadDelay(java.lang.String type, int delay) throws COMException {
        return ((java.lang.Integer) invokeN("SetKeypadDelay", new Object[]{type, new java.lang.Integer(delay)}, 2)).intValue();
    }
    public java.lang.String GetEnv(int index, java.lang.String name) throws COMException {
        return (java.lang.String) invokeN("GetEnv", new Object[]{new java.lang.Integer(index), name}, 2);
    }
    public int SetEnv(int index, java.lang.String name, java.lang.String value) throws COMException {
        return ((java.lang.Integer) invokeN("SetEnv", new Object[]{new java.lang.Integer(index), name, value}, 3)).intValue();
    }
    public int SendString(int hwnd, java.lang.String str) throws COMException {
        return ((java.lang.Integer) invokeN("SendString", new Object[]{new java.lang.Integer(hwnd), str}, 2)).intValue();
    }
    public int DelEnv(int index, java.lang.String name) throws COMException {
        return ((java.lang.Integer) invokeN("DelEnv", new Object[]{new java.lang.Integer(index), name}, 2)).intValue();
    }
    public java.lang.String GetPath() throws COMException {
        return (java.lang.String) invoke("GetPath");
    }
    public int SetDict(int index, java.lang.String dict_name) throws COMException {
        return ((java.lang.Integer) invokeN("SetDict", new Object[]{new java.lang.Integer(index), dict_name}, 2)).intValue();
    }
    public int FindPic(int x1, int y1, int x2, int y2, java.lang.String pic_name, java.lang.String delta_color, double sim, int dir, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("FindPic", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_name, delta_color, new java.lang.Double(sim), new java.lang.Integer(dir), x, y}, 10)).intValue();
    }
    public java.lang.String FindPicEx(int x1, int y1, int x2, int y2, java.lang.String pic_name, java.lang.String delta_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindPicEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_name, delta_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 8);
    }
    public int SetClientSize(int hwnd, int width, int height) throws COMException {
        return ((java.lang.Integer) invokeN("SetClientSize", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(width), new java.lang.Integer(height)}, 3)).intValue();
    }
    public int ReadInt(int hwnd, java.lang.String addr, int type) throws COMException {
        return ((java.lang.Integer) invokeN("ReadInt", new Object[]{new java.lang.Integer(hwnd), addr, new java.lang.Integer(type)}, 3)).intValue();
    }
    public float ReadFloat(int hwnd, java.lang.String addr) throws COMException {
        return ((java.lang.Float) invokeN("ReadFloat", new Object[]{new java.lang.Integer(hwnd), addr}, 2)).floatValue();
    }
    public double ReadDouble(int hwnd, java.lang.String addr) throws COMException {
        return ((java.lang.Double) invokeN("ReadDouble", new Object[]{new java.lang.Integer(hwnd), addr}, 2)).doubleValue();
    }
    public java.lang.String FindInt(int hwnd, java.lang.String addr_range, int int_value_min, int int_value_max, int type) throws COMException {
        return (java.lang.String) invokeN("FindInt", new Object[]{new java.lang.Integer(hwnd), addr_range, new java.lang.Integer(int_value_min), new java.lang.Integer(int_value_max), new java.lang.Integer(type)}, 5);
    }
    public java.lang.String FindFloat(int hwnd, java.lang.String addr_range, float float_value_min, float float_value_max) throws COMException {
        return (java.lang.String) invokeN("FindFloat", new Object[]{new java.lang.Integer(hwnd), addr_range, new java.lang.Float(float_value_min), new java.lang.Float(float_value_max)}, 4);
    }
    public java.lang.String FindDouble(int hwnd, java.lang.String addr_range, double double_value_min, double double_value_max) throws COMException {
        return (java.lang.String) invokeN("FindDouble", new Object[]{new java.lang.Integer(hwnd), addr_range, new java.lang.Double(double_value_min), new java.lang.Double(double_value_max)}, 4);
    }
    public java.lang.String FindString(int hwnd, java.lang.String addr_range, java.lang.String string_value, int type) throws COMException {
        return (java.lang.String) invokeN("FindString", new Object[]{new java.lang.Integer(hwnd), addr_range, string_value, new java.lang.Integer(type)}, 4);
    }
    public int GetModuleBaseAddr(int hwnd, java.lang.String module_name) throws COMException {
        return ((java.lang.Integer) invokeN("GetModuleBaseAddr", new Object[]{new java.lang.Integer(hwnd), module_name}, 2)).intValue();
    }
    public java.lang.String MoveToEx(int x, int y, int w, int h) throws COMException {
        return (java.lang.String) invokeN("MoveToEx", new Object[]{new java.lang.Integer(x), new java.lang.Integer(y), new java.lang.Integer(w), new java.lang.Integer(h)}, 4);
    }
    public java.lang.String MatchPicName(java.lang.String pic_name) throws COMException {
        return (java.lang.String) invokeN("MatchPicName", new Object[]{pic_name}, 1);
    }
    public int AddDict(int index, java.lang.String dict_info) throws COMException {
        return ((java.lang.Integer) invokeN("AddDict", new Object[]{new java.lang.Integer(index), dict_info}, 2)).intValue();
    }
    public int EnterCri() throws COMException {
        return ((java.lang.Integer) invoke("EnterCri")).intValue();
    }
    public int LeaveCri() throws COMException {
        return ((java.lang.Integer) invoke("LeaveCri")).intValue();
    }
    public int WriteInt(int hwnd, java.lang.String addr, int type, int v) throws COMException {
        return ((java.lang.Integer) invokeN("WriteInt", new Object[]{new java.lang.Integer(hwnd), addr, new java.lang.Integer(type), new java.lang.Integer(v)}, 4)).intValue();
    }
    public int WriteFloat(int hwnd, java.lang.String addr, float v) throws COMException {
        return ((java.lang.Integer) invokeN("WriteFloat", new Object[]{new java.lang.Integer(hwnd), addr, new java.lang.Float(v)}, 3)).intValue();
    }
    public int WriteDouble(int hwnd, java.lang.String addr, double v) throws COMException {
        return ((java.lang.Integer) invokeN("WriteDouble", new Object[]{new java.lang.Integer(hwnd), addr, new java.lang.Double(v)}, 3)).intValue();
    }
    public int WriteString(int hwnd, java.lang.String addr, int type, java.lang.String v) throws COMException {
        return ((java.lang.Integer) invokeN("WriteString", new Object[]{new java.lang.Integer(hwnd), addr, new java.lang.Integer(type), v}, 4)).intValue();
    }
    public int AsmAdd(java.lang.String asm_ins) throws COMException {
        return ((java.lang.Integer) invokeN("AsmAdd", new Object[]{asm_ins}, 1)).intValue();
    }
    public int AsmClear() throws COMException {
        return ((java.lang.Integer) invoke("AsmClear")).intValue();
    }
    public int AsmCall(int hwnd, int mode) throws COMException {
        return ((java.lang.Integer) invokeN("AsmCall", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(mode)}, 2)).intValue();
    }
    public int FindMultiColor(int x1, int y1, int x2, int y2, java.lang.String first_color, java.lang.String offset_color, double sim, int dir, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("FindMultiColor", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), first_color, offset_color, new java.lang.Double(sim), new java.lang.Integer(dir), x, y}, 10)).intValue();
    }
    public java.lang.String FindMultiColorEx(int x1, int y1, int x2, int y2, java.lang.String first_color, java.lang.String offset_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindMultiColorEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), first_color, offset_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 8);
    }
    public java.lang.String AsmCode(int base_addr) throws COMException {
        return (java.lang.String) invokeN("AsmCode", new Object[]{new java.lang.Integer(base_addr)}, 1);
    }
    public java.lang.String Assemble(java.lang.String asm_code, int base_addr, int is_upper) throws COMException {
        return (java.lang.String) invokeN("Assemble", new Object[]{asm_code, new java.lang.Integer(base_addr), new java.lang.Integer(is_upper)}, 3);
    }
    public int SetWindowTransparent(int hwnd, int v) throws COMException {
        return ((java.lang.Integer) invokeN("SetWindowTransparent", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(v)}, 2)).intValue();
    }
    public java.lang.String ReadData(int hwnd, java.lang.String addr, int len) throws COMException {
        return (java.lang.String) invokeN("ReadData", new Object[]{new java.lang.Integer(hwnd), addr, new java.lang.Integer(len)}, 3);
    }
    public int WriteData(int hwnd, java.lang.String addr, java.lang.String data) throws COMException {
        return ((java.lang.Integer) invokeN("WriteData", new Object[]{new java.lang.Integer(hwnd), addr, data}, 3)).intValue();
    }
    public java.lang.String FindData(int hwnd, java.lang.String addr_range, java.lang.String data) throws COMException {
        return (java.lang.String) invokeN("FindData", new Object[]{new java.lang.Integer(hwnd), addr_range, data}, 3);
    }
    public int SetPicPwd(java.lang.String pwd) throws COMException {
        return ((java.lang.Integer) invokeN("SetPicPwd", new Object[]{pwd}, 1)).intValue();
    }
    public int Log(java.lang.String info) throws COMException {
        return ((java.lang.Integer) invokeN("Log", new Object[]{info}, 1)).intValue();
    }
    public java.lang.String FindStrE(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("FindStrE", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim)}, 7);
    }
    public java.lang.String FindColorE(int x1, int y1, int x2, int y2, java.lang.String color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindColorE", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 7);
    }
    public java.lang.String FindPicE(int x1, int y1, int x2, int y2, java.lang.String pic_name, java.lang.String delta_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindPicE", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_name, delta_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 8);
    }
    public java.lang.String FindMultiColorE(int x1, int y1, int x2, int y2, java.lang.String first_color, java.lang.String offset_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindMultiColorE", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), first_color, offset_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 8);
    }
    public int SetExactOcr(int exact_ocr) throws COMException {
        return ((java.lang.Integer) invokeN("SetExactOcr", new Object[]{new java.lang.Integer(exact_ocr)}, 1)).intValue();
    }
    public java.lang.String ReadString(int hwnd, java.lang.String addr, int type, int len) throws COMException {
        return (java.lang.String) invokeN("ReadString", new Object[]{new java.lang.Integer(hwnd), addr, new java.lang.Integer(type), new java.lang.Integer(len)}, 4);
    }
    public int FoobarTextPrintDir(int hwnd, int dir) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarTextPrintDir", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(dir)}, 2)).intValue();
    }
    public java.lang.String OcrEx(int x1, int y1, int x2, int y2, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("OcrEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Double(sim)}, 6);
    }
    public int SetDisplayInput(java.lang.String mode) throws COMException {
        return ((java.lang.Integer) invokeN("SetDisplayInput", new Object[]{mode}, 1)).intValue();
    }
    public int GetTime() throws COMException {
        return ((java.lang.Integer) invoke("GetTime")).intValue();
    }
    public int GetScreenWidth() throws COMException {
        return ((java.lang.Integer) invoke("GetScreenWidth")).intValue();
    }
    public int GetScreenHeight() throws COMException {
        return ((java.lang.Integer) invoke("GetScreenHeight")).intValue();
    }
    public int BindWindowEx(int hwnd, java.lang.String display, java.lang.String mouse, java.lang.String keypad, java.lang.String public_desc, int mode) throws COMException {
        return ((java.lang.Integer) invokeN("BindWindowEx", new Object[]{new java.lang.Integer(hwnd), display, mouse, keypad, public_desc, new java.lang.Integer(mode)}, 6)).intValue();
    }
    public java.lang.String GetDiskSerial() throws COMException {
        return (java.lang.String) invoke("GetDiskSerial");
    }
    public java.lang.String Md5(java.lang.String str) throws COMException {
        return (java.lang.String) invokeN("Md5", new Object[]{str}, 1);
    }
    public java.lang.String GetMac() throws COMException {
        return (java.lang.String) invoke("GetMac");
    }
    public int ActiveInputMethod(int hwnd, java.lang.String id) throws COMException {
        return ((java.lang.Integer) invokeN("ActiveInputMethod", new Object[]{new java.lang.Integer(hwnd), id}, 2)).intValue();
    }
    public int CheckInputMethod(int hwnd, java.lang.String id) throws COMException {
        return ((java.lang.Integer) invokeN("CheckInputMethod", new Object[]{new java.lang.Integer(hwnd), id}, 2)).intValue();
    }
    public int FindInputMethod(java.lang.String id) throws COMException {
        return ((java.lang.Integer) invokeN("FindInputMethod", new Object[]{id}, 1)).intValue();
    }
    public int GetCursorPos(java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("GetCursorPos", new Object[]{x, y}, 2)).intValue();
    }
    public int BindWindow(int hwnd, java.lang.String display, java.lang.String mouse, java.lang.String keypad, int mode) throws COMException {
        return ((java.lang.Integer) invokeN("BindWindow", new Object[]{new java.lang.Integer(hwnd), display, mouse, keypad, new java.lang.Integer(mode)}, 5)).intValue();
    }
    public int FindWindow(java.lang.String class_name, java.lang.String title_name) throws COMException {
        return ((java.lang.Integer) invokeN("FindWindow", new Object[]{class_name, title_name}, 2)).intValue();
    }
    public int GetScreenDepth() throws COMException {
        return ((java.lang.Integer) invoke("GetScreenDepth")).intValue();
    }
    public int SetScreen(int width, int height, int depth) throws COMException {
        return ((java.lang.Integer) invokeN("SetScreen", new Object[]{new java.lang.Integer(width), new java.lang.Integer(height), new java.lang.Integer(depth)}, 3)).intValue();
    }
    public int ExitOs(int type) throws COMException {
        return ((java.lang.Integer) invokeN("ExitOs", new Object[]{new java.lang.Integer(type)}, 1)).intValue();
    }
    public java.lang.String GetDir(int type) throws COMException {
        return (java.lang.String) invokeN("GetDir", new Object[]{new java.lang.Integer(type)}, 1);
    }
    public int GetOsType() throws COMException {
        return ((java.lang.Integer) invoke("GetOsType")).intValue();
    }
    public int FindWindowEx(int parent, java.lang.String class_name, java.lang.String title_name) throws COMException {
        return ((java.lang.Integer) invokeN("FindWindowEx", new Object[]{new java.lang.Integer(parent), class_name, title_name}, 3)).intValue();
    }
    public int SetExportDict(int index, java.lang.String dict_name) throws COMException {
        return ((java.lang.Integer) invokeN("SetExportDict", new Object[]{new java.lang.Integer(index), dict_name}, 2)).intValue();
    }
    public java.lang.String GetCursorShape() throws COMException {
        return (java.lang.String) invoke("GetCursorShape");
    }
    public int DownCpu(int rate) throws COMException {
        return ((java.lang.Integer) invokeN("DownCpu", new Object[]{new java.lang.Integer(rate)}, 1)).intValue();
    }
    public java.lang.String GetCursorSpot() throws COMException {
        return (java.lang.String) invoke("GetCursorSpot");
    }
    public int SendString2(int hwnd, java.lang.String str) throws COMException {
        return ((java.lang.Integer) invokeN("SendString2", new Object[]{new java.lang.Integer(hwnd), str}, 2)).intValue();
    }
    public int FaqPost(java.lang.String server, int handle, int request_type, int time_out) throws COMException {
        return ((java.lang.Integer) invokeN("FaqPost", new Object[]{server, new java.lang.Integer(handle), new java.lang.Integer(request_type), new java.lang.Integer(time_out)}, 4)).intValue();
    }
    public java.lang.String FaqFetch() throws COMException {
        return (java.lang.String) invoke("FaqFetch");
    }
    public java.lang.String FetchWord(int x1, int y1, int x2, int y2, java.lang.String color, java.lang.String word) throws COMException {
        return (java.lang.String) invokeN("FetchWord", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, word}, 6);
    }
    public int CaptureJpg(int x1, int y1, int x2, int y2, java.lang.String file, int quality) throws COMException {
        return ((java.lang.Integer) invokeN("CaptureJpg", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), file, new java.lang.Integer(quality)}, 6)).intValue();
    }
    public int FindStrWithFont(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim, java.lang.String font_name, int font_size, int flag, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("FindStrWithFont", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim), font_name, new java.lang.Integer(font_size), new java.lang.Integer(flag), x, y}, 12)).intValue();
    }
    public java.lang.String FindStrWithFontE(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim, java.lang.String font_name, int font_size, int flag) throws COMException {
        return (java.lang.String) invokeN("FindStrWithFontE", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim), font_name, new java.lang.Integer(font_size), new java.lang.Integer(flag)}, 10);
    }
    public java.lang.String FindStrWithFontEx(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim, java.lang.String font_name, int font_size, int flag) throws COMException {
        return (java.lang.String) invokeN("FindStrWithFontEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim), font_name, new java.lang.Integer(font_size), new java.lang.Integer(flag)}, 10);
    }
    public java.lang.String GetDictInfo(java.lang.String str, java.lang.String font_name, int font_size, int flag) throws COMException {
        return (java.lang.String) invokeN("GetDictInfo", new Object[]{str, font_name, new java.lang.Integer(font_size), new java.lang.Integer(flag)}, 4);
    }
    public int SaveDict(int index, java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("SaveDict", new Object[]{new java.lang.Integer(index), file}, 2)).intValue();
    }
    public int GetWindowProcessId(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("GetWindowProcessId", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public java.lang.String GetWindowProcessPath(int hwnd) throws COMException {
        return (java.lang.String) invokeN("GetWindowProcessPath", new Object[]{new java.lang.Integer(hwnd)}, 1);
    }
    public int LockInput(int lock) throws COMException {
        return ((java.lang.Integer) invokeN("LockInput", new Object[]{new java.lang.Integer(lock)}, 1)).intValue();
    }
    public java.lang.String GetPicSize(java.lang.String pic_name) throws COMException {
        return (java.lang.String) invokeN("GetPicSize", new Object[]{pic_name}, 1);
    }
    public int GetID() throws COMException {
        return ((java.lang.Integer) invoke("GetID")).intValue();
    }
    public int CapturePng(int x1, int y1, int x2, int y2, java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("CapturePng", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), file}, 5)).intValue();
    }
    public int CaptureGif(int x1, int y1, int x2, int y2, java.lang.String file, int delay, int time) throws COMException {
        return ((java.lang.Integer) invokeN("CaptureGif", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), file, new java.lang.Integer(delay), new java.lang.Integer(time)}, 7)).intValue();
    }
    public int ImageToBmp(java.lang.String pic_name, java.lang.String bmp_name) throws COMException {
        return ((java.lang.Integer) invokeN("ImageToBmp", new Object[]{pic_name, bmp_name}, 2)).intValue();
    }
    public int FindStrFast(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("FindStrFast", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim), x, y}, 9)).intValue();
    }
    public java.lang.String FindStrFastEx(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("FindStrFastEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim)}, 7);
    }
    public java.lang.String FindStrFastE(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("FindStrFastE", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim)}, 7);
    }
    public int EnableDisplayDebug(int enable_debug) throws COMException {
        return ((java.lang.Integer) invokeN("EnableDisplayDebug", new Object[]{new java.lang.Integer(enable_debug)}, 1)).intValue();
    }
    public int CapturePre(java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("CapturePre", new Object[]{file}, 1)).intValue();
    }
    public int RegEx(java.lang.String code, java.lang.String Ver, java.lang.String ip) throws COMException {
        return ((java.lang.Integer) invokeN("RegEx", new Object[]{code, Ver, ip}, 3)).intValue();
    }
    public java.lang.String GetMachineCode() throws COMException {
        return (java.lang.String) invoke("GetMachineCode");
    }
    public int SetClipboard(java.lang.String data) throws COMException {
        return ((java.lang.Integer) invokeN("SetClipboard", new Object[]{data}, 1)).intValue();
    }
    public java.lang.String GetClipboard() throws COMException {
        return (java.lang.String) invoke("GetClipboard");
    }
    public int GetNowDict() throws COMException {
        return ((java.lang.Integer) invoke("GetNowDict")).intValue();
    }
    public int Is64Bit() throws COMException {
        return ((java.lang.Integer) invoke("Is64Bit")).intValue();
    }
    public int GetColorNum(int x1, int y1, int x2, int y2, java.lang.String color, double sim) throws COMException {
        return ((java.lang.Integer) invokeN("GetColorNum", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Double(sim)}, 6)).intValue();
    }
    public java.lang.String EnumWindowByProcess(java.lang.String process_name, java.lang.String title, java.lang.String class_name, int filter) throws COMException {
        return (java.lang.String) invokeN("EnumWindowByProcess", new Object[]{process_name, title, class_name, new java.lang.Integer(filter)}, 4);
    }
    public int GetDictCount(int index) throws COMException {
        return ((java.lang.Integer) invokeN("GetDictCount", new Object[]{new java.lang.Integer(index)}, 1)).intValue();
    }
    public int GetLastError() throws COMException {
        return ((java.lang.Integer) invoke("GetLastError")).intValue();
    }
    public java.lang.String GetNetTime() throws COMException {
        return (java.lang.String) invoke("GetNetTime");
    }
    public int EnableGetColorByCapture(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableGetColorByCapture", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int CheckUAC() throws COMException {
        return ((java.lang.Integer) invoke("CheckUAC")).intValue();
    }
    public int SetUAC(int uac) throws COMException {
        return ((java.lang.Integer) invokeN("SetUAC", new Object[]{new java.lang.Integer(uac)}, 1)).intValue();
    }
    public int DisableFontSmooth() throws COMException {
        return ((java.lang.Integer) invoke("DisableFontSmooth")).intValue();
    }
    public int CheckFontSmooth() throws COMException {
        return ((java.lang.Integer) invoke("CheckFontSmooth")).intValue();
    }
    public int SetDisplayAcceler(int level) throws COMException {
        return ((java.lang.Integer) invokeN("SetDisplayAcceler", new Object[]{new java.lang.Integer(level)}, 1)).intValue();
    }
    public int FindWindowByProcess(java.lang.String process_name, java.lang.String class_name, java.lang.String title_name) throws COMException {
        return ((java.lang.Integer) invokeN("FindWindowByProcess", new Object[]{process_name, class_name, title_name}, 3)).intValue();
    }
    public int FindWindowByProcessId(int process_id, java.lang.String class_name, java.lang.String title_name) throws COMException {
        return ((java.lang.Integer) invokeN("FindWindowByProcessId", new Object[]{new java.lang.Integer(process_id), class_name, title_name}, 3)).intValue();
    }
    public java.lang.String ReadIni(java.lang.String section, java.lang.String key, java.lang.String file) throws COMException {
        return (java.lang.String) invokeN("ReadIni", new Object[]{section, key, file}, 3);
    }
    public int WriteIni(java.lang.String section, java.lang.String key, java.lang.String v, java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("WriteIni", new Object[]{section, key, v, file}, 4)).intValue();
    }
    public int RunApp(java.lang.String path, int mode) throws COMException {
        return ((java.lang.Integer) invokeN("RunApp", new Object[]{path, new java.lang.Integer(mode)}, 2)).intValue();
    }
    public int delay(int mis) throws COMException {
        return ((java.lang.Integer) invokeN("delay", new Object[]{new java.lang.Integer(mis)}, 1)).intValue();
    }
    public int FindWindowSuper(java.lang.String spec1, int flag1, int type1, java.lang.String spec2, int flag2, int type2) throws COMException {
        return ((java.lang.Integer) invokeN("FindWindowSuper", new Object[]{spec1, new java.lang.Integer(flag1), new java.lang.Integer(type1), spec2, new java.lang.Integer(flag2), new java.lang.Integer(type2)}, 6)).intValue();
    }
    public java.lang.String ExcludePos(java.lang.String all_pos, int type, int x1, int y1, int x2, int y2) throws COMException {
        return (java.lang.String) invokeN("ExcludePos", new Object[]{all_pos, new java.lang.Integer(type), new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2)}, 6);
    }
    public java.lang.String FindNearestPos(java.lang.String all_pos, int type, int x, int y) throws COMException {
        return (java.lang.String) invokeN("FindNearestPos", new Object[]{all_pos, new java.lang.Integer(type), new java.lang.Integer(x), new java.lang.Integer(y)}, 4);
    }
    public java.lang.String SortPosDistance(java.lang.String all_pos, int type, int x, int y) throws COMException {
        return (java.lang.String) invokeN("SortPosDistance", new Object[]{all_pos, new java.lang.Integer(type), new java.lang.Integer(x), new java.lang.Integer(y)}, 4);
    }
    public int FindPicMem(int x1, int y1, int x2, int y2, java.lang.String pic_info, java.lang.String delta_color, double sim, int dir, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("FindPicMem", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_info, delta_color, new java.lang.Double(sim), new java.lang.Integer(dir), x, y}, 10)).intValue();
    }
    public java.lang.String FindPicMemEx(int x1, int y1, int x2, int y2, java.lang.String pic_info, java.lang.String delta_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindPicMemEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_info, delta_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 8);
    }
    public java.lang.String FindPicMemE(int x1, int y1, int x2, int y2, java.lang.String pic_info, java.lang.String delta_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindPicMemE", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_info, delta_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 8);
    }
    public java.lang.String AppendPicAddr(java.lang.String pic_info, int addr, int size) throws COMException {
        return (java.lang.String) invokeN("AppendPicAddr", new Object[]{pic_info, new java.lang.Integer(addr), new java.lang.Integer(size)}, 3);
    }
    public int WriteFile(java.lang.String file, java.lang.String content) throws COMException {
        return ((java.lang.Integer) invokeN("WriteFile", new Object[]{file, content}, 2)).intValue();
    }
    public int Stop(int id) throws COMException {
        return ((java.lang.Integer) invokeN("Stop", new Object[]{new java.lang.Integer(id)}, 1)).intValue();
    }
    public int SetDictMem(int index, int addr, int size) throws COMException {
        return ((java.lang.Integer) invokeN("SetDictMem", new Object[]{new java.lang.Integer(index), new java.lang.Integer(addr), new java.lang.Integer(size)}, 3)).intValue();
    }
    public java.lang.String GetNetTimeSafe() throws COMException {
        return (java.lang.String) invoke("GetNetTimeSafe");
    }
    public int ForceUnBindWindow(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("ForceUnBindWindow", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public java.lang.String ReadIniPwd(java.lang.String section, java.lang.String key, java.lang.String file, java.lang.String pwd) throws COMException {
        return (java.lang.String) invokeN("ReadIniPwd", new Object[]{section, key, file, pwd}, 4);
    }
    public int WriteIniPwd(java.lang.String section, java.lang.String key, java.lang.String v, java.lang.String file, java.lang.String pwd) throws COMException {
        return ((java.lang.Integer) invokeN("WriteIniPwd", new Object[]{section, key, v, file, pwd}, 5)).intValue();
    }
    public int DecodeFile(java.lang.String file, java.lang.String pwd) throws COMException {
        return ((java.lang.Integer) invokeN("DecodeFile", new Object[]{file, pwd}, 2)).intValue();
    }
    public int KeyDownChar(java.lang.String key_str) throws COMException {
        return ((java.lang.Integer) invokeN("KeyDownChar", new Object[]{key_str}, 1)).intValue();
    }
    public int KeyUpChar(java.lang.String key_str) throws COMException {
        return ((java.lang.Integer) invokeN("KeyUpChar", new Object[]{key_str}, 1)).intValue();
    }
    public int KeyPressChar(java.lang.String key_str) throws COMException {
        return ((java.lang.Integer) invokeN("KeyPressChar", new Object[]{key_str}, 1)).intValue();
    }
    public int KeyPressStr(java.lang.String key_str, int delay) throws COMException {
        return ((java.lang.Integer) invokeN("KeyPressStr", new Object[]{key_str, new java.lang.Integer(delay)}, 2)).intValue();
    }
    public int EnableKeypadPatch(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableKeypadPatch", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int EnableKeypadSync(int en, int time_out) throws COMException {
        return ((java.lang.Integer) invokeN("EnableKeypadSync", new Object[]{new java.lang.Integer(en), new java.lang.Integer(time_out)}, 2)).intValue();
    }
    public int EnableMouseSync(int en, int time_out) throws COMException {
        return ((java.lang.Integer) invokeN("EnableMouseSync", new Object[]{new java.lang.Integer(en), new java.lang.Integer(time_out)}, 2)).intValue();
    }
    public int DmGuard(int en, java.lang.String type) throws COMException {
        return ((java.lang.Integer) invokeN("DmGuard", new Object[]{new java.lang.Integer(en), type}, 2)).intValue();
    }
    public int FaqCaptureFromFile(int x1, int y1, int x2, int y2, java.lang.String file, int quality) throws COMException {
        return ((java.lang.Integer) invokeN("FaqCaptureFromFile", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), file, new java.lang.Integer(quality)}, 6)).intValue();
    }
    public java.lang.String FindIntEx(int hwnd, java.lang.String addr_range, int int_value_min, int int_value_max, int type, int step, int multi_thread, int mode) throws COMException {
        return (java.lang.String) invokeN("FindIntEx", new Object[]{new java.lang.Integer(hwnd), addr_range, new java.lang.Integer(int_value_min), new java.lang.Integer(int_value_max), new java.lang.Integer(type), new java.lang.Integer(step), new java.lang.Integer(multi_thread), new java.lang.Integer(mode)}, 8);
    }
    public java.lang.String FindFloatEx(int hwnd, java.lang.String addr_range, float float_value_min, float float_value_max, int step, int multi_thread, int mode) throws COMException {
        return (java.lang.String) invokeN("FindFloatEx", new Object[]{new java.lang.Integer(hwnd), addr_range, new java.lang.Float(float_value_min), new java.lang.Float(float_value_max), new java.lang.Integer(step), new java.lang.Integer(multi_thread), new java.lang.Integer(mode)}, 7);
    }
    public java.lang.String FindDoubleEx(int hwnd, java.lang.String addr_range, double double_value_min, double double_value_max, int step, int multi_thread, int mode) throws COMException {
        return (java.lang.String) invokeN("FindDoubleEx", new Object[]{new java.lang.Integer(hwnd), addr_range, new java.lang.Double(double_value_min), new java.lang.Double(double_value_max), new java.lang.Integer(step), new java.lang.Integer(multi_thread), new java.lang.Integer(mode)}, 7);
    }
    public java.lang.String FindStringEx(int hwnd, java.lang.String addr_range, java.lang.String string_value, int type, int step, int multi_thread, int mode) throws COMException {
        return (java.lang.String) invokeN("FindStringEx", new Object[]{new java.lang.Integer(hwnd), addr_range, string_value, new java.lang.Integer(type), new java.lang.Integer(step), new java.lang.Integer(multi_thread), new java.lang.Integer(mode)}, 7);
    }
    public java.lang.String FindDataEx(int hwnd, java.lang.String addr_range, java.lang.String data, int step, int multi_thread, int mode) throws COMException {
        return (java.lang.String) invokeN("FindDataEx", new Object[]{new java.lang.Integer(hwnd), addr_range, data, new java.lang.Integer(step), new java.lang.Integer(multi_thread), new java.lang.Integer(mode)}, 6);
    }
    public int EnableRealMouse(int en, int mousedelay, int mousestep) throws COMException {
        return ((java.lang.Integer) invokeN("EnableRealMouse", new Object[]{new java.lang.Integer(en), new java.lang.Integer(mousedelay), new java.lang.Integer(mousestep)}, 3)).intValue();
    }
    public int EnableRealKeypad(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableRealKeypad", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int SendStringIme(java.lang.String str) throws COMException {
        return ((java.lang.Integer) invokeN("SendStringIme", new Object[]{str}, 1)).intValue();
    }
    public int FoobarDrawLine(int hwnd, int x1, int y1, int x2, int y2, java.lang.String color, int style, int width) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarDrawLine", new Object[]{new java.lang.Integer(hwnd), new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Integer(style), new java.lang.Integer(width)}, 8)).intValue();
    }
    public java.lang.String FindStrEx(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("FindStrEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim)}, 7);
    }
    public int IsBind(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("IsBind", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public int SetDisplayDelay(int t) throws COMException {
        return ((java.lang.Integer) invokeN("SetDisplayDelay", new Object[]{new java.lang.Integer(t)}, 1)).intValue();
    }
    public int GetDmCount() throws COMException {
        return ((java.lang.Integer) invoke("GetDmCount")).intValue();
    }
    public int DisableScreenSave() throws COMException {
        return ((java.lang.Integer) invoke("DisableScreenSave")).intValue();
    }
    public int DisablePowerSave() throws COMException {
        return ((java.lang.Integer) invoke("DisablePowerSave")).intValue();
    }
    public int SetMemoryHwndAsProcessId(int en) throws COMException {
        return ((java.lang.Integer) invokeN("SetMemoryHwndAsProcessId", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int FindShape(int x1, int y1, int x2, int y2, java.lang.String offset_color, double sim, int dir, java.lang.Object x, java.lang.Object y) throws COMException {
        return ((java.lang.Integer) invokeN("FindShape", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), offset_color, new java.lang.Double(sim), new java.lang.Integer(dir), x, y}, 9)).intValue();
    }
    public java.lang.String FindShapeE(int x1, int y1, int x2, int y2, java.lang.String offset_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindShapeE", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), offset_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 7);
    }
    public java.lang.String FindShapeEx(int x1, int y1, int x2, int y2, java.lang.String offset_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindShapeEx", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), offset_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 7);
    }
    public java.lang.String FindStrS(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim, java.lang.Object x, java.lang.Object y) throws COMException {
        return (java.lang.String) invokeN("FindStrS", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim), x, y}, 9);
    }
    public java.lang.String FindStrExS(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("FindStrExS", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim)}, 7);
    }
    public java.lang.String FindStrFastS(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim, java.lang.Object x, java.lang.Object y) throws COMException {
        return (java.lang.String) invokeN("FindStrFastS", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim), x, y}, 9);
    }
    public java.lang.String FindStrFastExS(int x1, int y1, int x2, int y2, java.lang.String str, java.lang.String color, double sim) throws COMException {
        return (java.lang.String) invokeN("FindStrFastExS", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), str, color, new java.lang.Double(sim)}, 7);
    }
    public java.lang.String FindPicS(int x1, int y1, int x2, int y2, java.lang.String pic_name, java.lang.String delta_color, double sim, int dir, java.lang.Object x, java.lang.Object y) throws COMException {
        return (java.lang.String) invokeN("FindPicS", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_name, delta_color, new java.lang.Double(sim), new java.lang.Integer(dir), x, y}, 10);
    }
    public java.lang.String FindPicExS(int x1, int y1, int x2, int y2, java.lang.String pic_name, java.lang.String delta_color, double sim, int dir) throws COMException {
        return (java.lang.String) invokeN("FindPicExS", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), pic_name, delta_color, new java.lang.Double(sim), new java.lang.Integer(dir)}, 8);
    }
    public int ClearDict(int index) throws COMException {
        return ((java.lang.Integer) invokeN("ClearDict", new Object[]{new java.lang.Integer(index)}, 1)).intValue();
    }
    public java.lang.String GetMachineCodeNoMac() throws COMException {
        return (java.lang.String) invoke("GetMachineCodeNoMac");
    }
    public int GetClientRect(int hwnd, java.lang.Object x1, java.lang.Object y1, java.lang.Object x2, java.lang.Object y2) throws COMException {
        return ((java.lang.Integer) invokeN("GetClientRect", new Object[]{new java.lang.Integer(hwnd), x1, y1, x2, y2}, 5)).intValue();
    }
    public int EnableFakeActive(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableFakeActive", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int GetScreenDataBmp(int x1, int y1, int x2, int y2, java.lang.Object data, java.lang.Object size) throws COMException {
        return ((java.lang.Integer) invokeN("GetScreenDataBmp", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), data, size}, 6)).intValue();
    }
    public int EncodeFile(java.lang.String file, java.lang.String pwd) throws COMException {
        return ((java.lang.Integer) invokeN("EncodeFile", new Object[]{file, pwd}, 2)).intValue();
    }
    public java.lang.String GetCursorShapeEx(int type) throws COMException {
        return (java.lang.String) invokeN("GetCursorShapeEx", new Object[]{new java.lang.Integer(type)}, 1);
    }
    public int FaqCancel() throws COMException {
        return ((java.lang.Integer) invoke("FaqCancel")).intValue();
    }
    public java.lang.String IntToData(int int_value, int type) throws COMException {
        return (java.lang.String) invokeN("IntToData", new Object[]{new java.lang.Integer(int_value), new java.lang.Integer(type)}, 2);
    }
    public java.lang.String FloatToData(float float_value) throws COMException {
        return (java.lang.String) invokeN("FloatToData", new Object[]{new java.lang.Float(float_value)}, 1);
    }
    public java.lang.String DoubleToData(double double_value) throws COMException {
        return (java.lang.String) invokeN("DoubleToData", new Object[]{new java.lang.Double(double_value)}, 1);
    }
    public java.lang.String StringToData(java.lang.String string_value, int type) throws COMException {
        return (java.lang.String) invokeN("StringToData", new Object[]{string_value, new java.lang.Integer(type)}, 2);
    }
    public int SetMemoryFindResultToFile(java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("SetMemoryFindResultToFile", new Object[]{file}, 1)).intValue();
    }
    public int EnableBind(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableBind", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int SetSimMode(int mode) throws COMException {
        return ((java.lang.Integer) invokeN("SetSimMode", new Object[]{new java.lang.Integer(mode)}, 1)).intValue();
    }
    public int LockMouseRect(int x1, int y1, int x2, int y2) throws COMException {
        return ((java.lang.Integer) invokeN("LockMouseRect", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2)}, 4)).intValue();
    }
    public int SendPaste(int hwnd) throws COMException {
        return ((java.lang.Integer) invokeN("SendPaste", new Object[]{new java.lang.Integer(hwnd)}, 1)).intValue();
    }
    public int IsDisplayDead(int x1, int y1, int x2, int y2, int t) throws COMException {
        return ((java.lang.Integer) invokeN("IsDisplayDead", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), new java.lang.Integer(t)}, 5)).intValue();
    }
    public int GetKeyState(int vk) throws COMException {
        return ((java.lang.Integer) invokeN("GetKeyState", new Object[]{new java.lang.Integer(vk)}, 1)).intValue();
    }
    public int CopyFile(java.lang.String src_file, java.lang.String dst_file, int over) throws COMException {
        return ((java.lang.Integer) invokeN("CopyFile", new Object[]{src_file, dst_file, new java.lang.Integer(over)}, 3)).intValue();
    }
    public int IsFileExist(java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("IsFileExist", new Object[]{file}, 1)).intValue();
    }
    public int DeleteFile(java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("DeleteFile", new Object[]{file}, 1)).intValue();
    }
    public int MoveFile(java.lang.String src_file, java.lang.String dst_file) throws COMException {
        return ((java.lang.Integer) invokeN("MoveFile", new Object[]{src_file, dst_file}, 2)).intValue();
    }
    public int CreateFolder(java.lang.String folder_name) throws COMException {
        return ((java.lang.Integer) invokeN("CreateFolder", new Object[]{folder_name}, 1)).intValue();
    }
    public int DeleteFolder(java.lang.String folder_name) throws COMException {
        return ((java.lang.Integer) invokeN("DeleteFolder", new Object[]{folder_name}, 1)).intValue();
    }
    public int GetFileLength(java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("GetFileLength", new Object[]{file}, 1)).intValue();
    }
    public java.lang.String ReadFile(java.lang.String file) throws COMException {
        return (java.lang.String) invokeN("ReadFile", new Object[]{file}, 1);
    }
    public int WaitKey(int key_code, int time_out) throws COMException {
        return ((java.lang.Integer) invokeN("WaitKey", new Object[]{new java.lang.Integer(key_code), new java.lang.Integer(time_out)}, 2)).intValue();
    }
    public int DeleteIni(java.lang.String section, java.lang.String key, java.lang.String file) throws COMException {
        return ((java.lang.Integer) invokeN("DeleteIni", new Object[]{section, key, file}, 3)).intValue();
    }
    public int DeleteIniPwd(java.lang.String section, java.lang.String key, java.lang.String file, java.lang.String pwd) throws COMException {
        return ((java.lang.Integer) invokeN("DeleteIniPwd", new Object[]{section, key, file, pwd}, 4)).intValue();
    }
    public int EnableSpeedDx(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableSpeedDx", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int EnableIme(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableIme", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int Reg(java.lang.String code, java.lang.String Ver) throws COMException {
        return ((java.lang.Integer) invokeN("Reg", new Object[]{code, Ver}, 2)).intValue();
    }
    public java.lang.String SelectFile() throws COMException {
        return (java.lang.String) invoke("SelectFile");
    }
    public java.lang.String SelectDirectory() throws COMException {
        return (java.lang.String) invoke("SelectDirectory");
    }
    public int LockDisplay(int lock) throws COMException {
        return ((java.lang.Integer) invokeN("LockDisplay", new Object[]{new java.lang.Integer(lock)}, 1)).intValue();
    }
    public int FoobarSetSave(int hwnd, java.lang.String file, int en, java.lang.String header) throws COMException {
        return ((java.lang.Integer) invokeN("FoobarSetSave", new Object[]{new java.lang.Integer(hwnd), file, new java.lang.Integer(en), header}, 4)).intValue();
    }
    public java.lang.String EnumWindowSuper(java.lang.String spec1, int flag1, int type1, java.lang.String spec2, int flag2, int type2, int sort) throws COMException {
        return (java.lang.String) invokeN("EnumWindowSuper", new Object[]{spec1, new java.lang.Integer(flag1), new java.lang.Integer(type1), spec2, new java.lang.Integer(flag2), new java.lang.Integer(type2), new java.lang.Integer(sort)}, 7);
    }
    public int DownloadFile(java.lang.String url, java.lang.String save_file, int timeout) throws COMException {
        return ((java.lang.Integer) invokeN("DownloadFile", new Object[]{url, save_file, new java.lang.Integer(timeout)}, 3)).intValue();
    }
    public int EnableKeypadMsg(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableKeypadMsg", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int EnableMouseMsg(int en) throws COMException {
        return ((java.lang.Integer) invokeN("EnableMouseMsg", new Object[]{new java.lang.Integer(en)}, 1)).intValue();
    }
    public int RegNoMac(java.lang.String code, java.lang.String Ver) throws COMException {
        return ((java.lang.Integer) invokeN("RegNoMac", new Object[]{code, Ver}, 2)).intValue();
    }
    public int RegExNoMac(java.lang.String code, java.lang.String Ver, java.lang.String ip) throws COMException {
        return ((java.lang.Integer) invokeN("RegExNoMac", new Object[]{code, Ver, ip}, 3)).intValue();
    }
    public int SetEnumWindowDelay(int delay) throws COMException {
        return ((java.lang.Integer) invokeN("SetEnumWindowDelay", new Object[]{new java.lang.Integer(delay)}, 1)).intValue();
    }
    public int FindMulColor(int x1, int y1, int x2, int y2, java.lang.String color, double sim) throws COMException {
        return ((java.lang.Integer) invokeN("FindMulColor", new Object[]{new java.lang.Integer(x1), new java.lang.Integer(y1), new java.lang.Integer(x2), new java.lang.Integer(y2), color, new java.lang.Double(sim)}, 6)).intValue();
    }
    public java.lang.String GetDict(int index, int font_index) throws COMException {
        return (java.lang.String) invokeN("GetDict", new Object[]{new java.lang.Integer(index), new java.lang.Integer(font_index)}, 2);
    }
}
