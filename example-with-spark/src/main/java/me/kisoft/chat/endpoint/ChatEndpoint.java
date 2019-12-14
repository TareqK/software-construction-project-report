/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.chat.endpoint;

import me.kisoft.chat.entity.ChatMessage;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import me.kisoft.jesse.DefaultSessionManager;
import me.kisoft.jesse.SseEvent;

/**
 *
 * @author tareq
 */
@Path("chat")
public class ChatEndpoint {

  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<ChatMessage> getAllMessages() {
    return new ArrayList<>();
  }

  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  public Response createMessage(ChatMessage message) {
    DefaultSessionManager.broadcastEvent(SseEvent.getBuilder().data(message)
     .event("message")
     .mediaType(MediaType.APPLICATION_JSON)
     .retry(500)
     .build());
    return Response.ok().build();
  }

}
