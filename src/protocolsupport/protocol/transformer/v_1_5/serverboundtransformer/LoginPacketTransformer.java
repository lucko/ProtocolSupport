package protocolsupport.protocol.transformer.v_1_5.serverboundtransformer;

import java.util.Collection;
import java.util.Collections;

import io.netty.channel.Channel;

import net.minecraft.server.v1_8_R3.Packet;

import protocolsupport.protocol.PacketDataSerializer;
import protocolsupport.protocol.ServerBoundPacket;
import protocolsupport.utils.PacketCreator;

public class LoginPacketTransformer implements PacketTransformer {

	@Override
	public Collection<Packet<?>> transform(Channel channel, int packetId, PacketDataSerializer serializer) throws Exception {
		switch (packetId) {
			case 0xFC: {
				return Collections.<Packet<?>>singletonList(PacketCreator.createWithData(ServerBoundPacket.LOGIN_ENCRYPTION_BEGIN.get(), serializer));
			}
		}
		return null;
	}

}