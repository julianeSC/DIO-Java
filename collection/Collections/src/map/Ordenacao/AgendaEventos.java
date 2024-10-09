package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    // atributo

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(Map<LocalDate, Evento> eventosMap) {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirEvento() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProxEvento() {
        // Set<LocalDate> dateSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap
        .entrySet()) {
            
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);

                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos(null);

        //agendaEventos.adicionarEvento(LocalDate.of(2024,Month.OCTOBER , 9), "Evento1", "Atração1");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.SEPTEMBER , 10), "Evento2", "Atração2");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.DECEMBER , 17), "Evento3", "Atração3");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.OCTOBER , 10), "Evento4", "Atração4");

        agendaEventos.exibirEvento();
        agendaEventos.obterProxEvento();
    }

}
