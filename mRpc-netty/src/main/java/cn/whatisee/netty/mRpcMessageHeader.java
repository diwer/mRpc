package cn.whatisee.netty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ming on 2017/3/18.
 */
public class mRpcMessageHeader {
    private int crcCode;    //校验字段
    private int length;     // 消息长度
    private long sessionID; //会话ID
    private byte type;      // 消息类型
    private byte priority;  // 优先级
    private Map<String, Object> attachment;  // 其他参数

    public mRpcMessageHeader() {
        attachment = new HashMap<String, Object>();
    }

    public int getCrcCode() {
        return crcCode;
    }

    public void setCrcCode(int crcCode) {
        this.crcCode = crcCode;
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getSessionID() {
        return sessionID;
    }

    public void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public Map<String, Object> getAttachment() {
        return attachment;
    }

    public void setAttachment(Map<String, Object> attachment) {
        this.attachment = attachment;
    }
}
