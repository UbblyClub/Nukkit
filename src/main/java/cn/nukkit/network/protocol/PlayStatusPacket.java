package cn.nukkit.network.protocol;

public class PlayStatusPacket extends DataPacket {

    @Override
    public byte pid() {
        return ProtocolInfo.PLAY_STATUS_PACKET;
    }

    public static final int LOGIN_SUCCESS = 0;
    public static final int LOGIN_FAILED_CLIENT = 1;
    public static final int LOGIN_FAILED_SERVER = 2;
    public static final int PLAYER_SPAWN = 3;
    public static final int LOGIN_FAILED_INVALID_TENANT = 4;
    public static final int LOGIN_FAILED_VANILLA_EDU = 5;
    public static final int LOGIN_FAILED_EDU_VANILLA = 6;
    public static final int LOGIN_FAILED_SERVER_FULL = 7;

    public int status;

    @Override
    public void decode() {
    }

    @Override
    public void encode() {
        this.reset();
        this.putInt(this.status);
    }
}